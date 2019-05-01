package com.hpe.day11;
/*
 * 题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数 
 */
import java.util.Scanner;

public class MoveMN {
	public static void main(String[] args) {
		//创建存数的数组
		int num = 6;
		int[] arr = new int[num];
		//循环输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//遍历初始化数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +"");
		}
		
		//核心代码：移动
		System.out.println("输入移动的位数");
		int move = sc.nextInt();
		int[] arr2 = new int[move];
		//将旧数组向前移动后赋值给新数组
		for (int i = 0; i < move; i++) {
			arr2[i] = arr[num - move + i];
		}
		//将原数组向后移动
		for (int i = num - 1; i >= move; i--) {
			arr[i] = arr[i - move];
		}
		//将向前移动好的数组赋值给向后移动好的旧数组
		for (int i = 0; i < move; i++) {
			arr[i] = arr2[i];
		}
		
		//遍历移动后的数组
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] +" ");
		}
		
		//关闭资源
		sc.close();
	}
}
