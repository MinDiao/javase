package com.hpe.day06;

import java.util.Scanner;

/*
 * 题目：一个5位数，判断它是不是回文数。
 * 即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class Callback {
	public static void main(String[] args) {
		//输入
		System.out.println("请输入");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		//求出每一位
		int g = input % 10;
		int s = input / 10 % 10;
		int b = input / 100 % 10;
		int q = input / 1000 % 10;
		int w = input / 10000;
		//判断
		if (g == w && s == q) {
			System.out.println("是回数");
		} else {
			System.out.println("不是回数");
		}
		
	}
}
