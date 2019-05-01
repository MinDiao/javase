package com.hpe.day10;
/*
 * 取一个整数a从右端开始的4～7位。
 */
import java.util.Scanner;

public class Acquire {
	public static void main(String[] args) {
		//输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入");
		long input = sc.nextLong();
		//将长整型转换为字符串
		String str = String.valueOf(input);
		//将字符串转换为字符数组
		char[] c = str.toCharArray();
		//获取字符数组的长度
		int len = c.length;
		System.out.println(""+c[len-4]+c[len-5]+c[len-6]+c[len-7]);
		//关闭资源
		sc.close();
	}
}
