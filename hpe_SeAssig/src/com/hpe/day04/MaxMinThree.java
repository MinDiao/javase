package com.hpe.day04;

import java.util.Scanner;

/*
 * 	输入三个整数x,y,z，请把这三个数由小到大输出。
 */
public class MaxMinThree {
	public static void main(String[] args) {
		//键盘输入
		System.out.println("请依次输入三个数:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//初始化第三个空值
		int t = 0;
		//第一个数与第二个数比较,交换最大值
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		//第一个数与第三个数比较,交换最大值
		if (a > c) {
			t = a;
			a = c;
			c = t;
		}
		//第二个数与第三个数比较,交换最大值
		if (b > c) {
			t = b;
			b = c;
			c = t;
		}
		System.out.println(a +","+ b +","+ c);
	}
}
