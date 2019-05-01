package com.hp.assigments01;

import java.util.Scanner;

/*
 * 	键盘录入三个数据,获取这三个数据中的最大值
 * 	思路:分别将录入的三个数据赋值给三个变量,然后定义一个公共变量,将其中一个变量赋值给公共变量,用公共变量与另一个变量进行比较,另一个同上,最后输出最大值
 */
public class assigment03 {
	public static void main(String[] args) {
		System.out.println("请输入第一个数");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("请输入第二个数");
		int b = sc.nextInt();
		System.out.println("请输入第三个数");
		int c = sc.nextInt();
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.println("最大值为:"+ max);
	}
}
