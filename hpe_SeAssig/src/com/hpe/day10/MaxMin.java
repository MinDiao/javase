package com.hpe.day10;
/*
 * 输入3个数a,b,c，按大小顺序输出
 */
import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入3个数");
		//初始化数组
		int[] arr = new int[3];
		//循环输入
		for (int i = 0; i < arr.length; i++) {
			System.out.println("第"+ ++i +"个");
			arr[i-1] = sc.nextInt();
			System.out.println("第"+ ++i +"个");
			arr[i-1] = sc.nextInt();
			System.out.println("第"+ ++i +"个");
			arr[i-1] = sc.nextInt();
		}
		//关闭资源
		sc.close();
		//比较
		//创建一个初值
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];	
			}
		}
		System.out.println("最大值："+max+"最小值"+min);
	}
}
