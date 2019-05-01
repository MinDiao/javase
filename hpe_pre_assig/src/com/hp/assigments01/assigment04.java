package com.hp.assigments01;
/*
 * 	键盘录入两个数据,比较这两个数据是否相等
 * 	思路:分别将录入的两个数据赋值给两个变量,然后将两个变量进行if...else比较两个值的地址是否相等
 */
import java.util.Scanner;

public class assigment04 {
	public static void main(String[] args) {
		System.out.println("请输入第一个数");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("请输入第二个数");
		int b = sc.nextInt();
		if (a != b) {
			System.out.println("输入的两个数不相等");
		} else {
			System.out.println("输入的两个数相等");
		}
	}
}
