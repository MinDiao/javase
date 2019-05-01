package com.hpe.day10;

import java.util.Scanner;
/*
 * 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组
 */
public class Exchange {
	public static void main(String[] args) {
		//输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入5个数");
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		//求最值
		int max = arr[0];
		int min = arr[0];
		int maxindex = 0;//求出最大值时的数组下标
		int minindex = 0;//求出最小值时的数组下标
		for (int i = 0; i < arr.length; i++) {
			//最大值
			if (arr[i] > max) {
				max = arr[i];
				maxindex = i;
			}
			//最小值
			if (arr[i] < min) {
				min = arr[i];
				minindex = i;
			}
			//输出初始化数组
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		System.out.println("最大值为"+ max +" 最小值为"+ min);
		//交换最大值与第一位位置
		if (maxindex != 0) {//最大为第一位时不需要替换位置
			int temp = arr[0];
			arr[0] = arr[maxindex];
			arr[maxindex] = temp;
		}
		//交换最小值与最后一位位置
		if (minindex != arr.length - 1) {//最小为最后一位时不需要替换位置
			int temp = arr[arr.length - 1];
			arr[arr.length - 1] = arr[minindex];
			arr[minindex] = temp;
		}
		//遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
}
