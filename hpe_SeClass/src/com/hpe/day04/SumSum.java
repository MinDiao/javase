package com.hpe.day04;

import java.util.Scanner;

/*
 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，
 * 几个数相加有键盘控制。
 */
public class SumSum {
	public static void main(String[] args) {
		
		System.out.println("请输入相加的数");
		Scanner sc = new Scanner(System.in);
		//输入哪个数相加
		int num = sc.nextInt();
		//输入相加几次
		System.out.println("请输入相加的次数");
		int sum = sc.nextInt();
		//方法一：
		//每次生成新数
		int temp = 0;
		//循环
		for (int i = 0; i < sum; i++) {
			temp = temp * 10 + num;
			System.out.println(temp);
		}
		
		//方法二：
		int temp2 = num;
		for (int i = 0; i < sum; i++) {
			
		}
	}
}
