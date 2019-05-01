package com.hp.assigments01;
/*
 * 	键盘录入两个数据,获取这两个数据中的最大值
 * 	思路:分别将录入的两个数据赋值给两个变量,然后定义一个公共变量,将其中一个变量赋值给公共变量,用公共变量与另一个变量进行比较,输出最大值
 */
import java.util.Scanner;

public class assigment02 {
	public static void main(String[] args) {
		System.out.println("请输入第一个数");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("请输入第二个数");
		int b = sc.nextInt();
		int max = a;
		if (b > max) {
			max = b;
		}
		System.out.println("最大值为:"+ max);
	}
}
