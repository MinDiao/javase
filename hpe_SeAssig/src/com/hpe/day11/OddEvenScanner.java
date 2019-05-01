package com.hpe.day11;

import java.util.Scanner;
/*
 * 题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n
 * 当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数)
 */
public class OddEvenScanner {
	//奇数
	public static double odd(int n) {
		double sum = 0.0;
		for (int i = 2; i < n + 1; i+=2) {
			sum += 1.0 / i;
		}
		return sum;
	}
	//偶数
	public static double even(int n) {
		double sum = 0.0;
		for (int i = 1; i < n + 1; i+=2) {
			sum += 1.0 / i;
		}
		return sum;
	}
	public static void main(String[] args) {
		//输入数值
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入");
		int n = sc.nextInt();
		//判断奇偶
		if (n % 2 == 0) {
			System.out.println(odd(n));
		} else {
			System.out.println(even(n));
		}
		//关闭资源
		sc.close();
	}
}
