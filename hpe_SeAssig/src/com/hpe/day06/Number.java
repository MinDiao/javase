package com.hpe.day06;

import java.util.Scanner;

/*
 * 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字
 */
public class Number {
	public static void main(String[] args) {
		//输入
		System.out.println("请输入");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		//转换为字符串
		String s = "" + input;
		//获取长度
		int len = s.length();
		if (len > 5) {
			//System.out.println("输入超出5位");
			return;
		} else {
			System.out.println("长度为："+ len);
			//创建数组
			int[] arr = new int[len];
			
			//给数组赋值
			MyNum(arr, input);
			
			//逆序
			MyRev(arr);
			
			//遍历
			Traversal(arr);
			sc.close();
		}
		
	}
	//给数组赋值-使用了方法和功能引用数据类型赋值的新方法
	public static void MyNum(int[] arr, int input) {
		for (int i = 0; i < arr.length; i++) {
			arr[arr.length - i - 1] = input % 10;
			input /= 10;
		}
	}
		
	//逆序
	public static void MyRev(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}
	
	//遍历
	public static void Traversal(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] +",");
			}
		}
	}
}
