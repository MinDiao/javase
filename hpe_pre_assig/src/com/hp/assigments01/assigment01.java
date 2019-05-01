package com.hp.assigments01;

import java.util.Scanner;

/*
 * 	键盘录入两个数据，并对这两个数据求和，输出其结果
 * 	思路:分别将录入的两个数据赋值给两个变量,然后进行算术运算
 */
public class assigment01 {
	public static void main(String[] args) {
		System.out.println("请输入第一个数");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("请输入第二个数");
		int b = sc.nextInt();
		System.out.println("结果为"+ a + b);
	}
}
