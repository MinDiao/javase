package com.hpe.day02;

import java.util.Scanner;
/*
 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，
 * 几个数相加有键盘控制
 */

/*  分析:
 *  怎么得到这几个数,2+22+222+2222+22222抽取成
 *  2+0*10 
 *  2+2*10(2是上一个算式的和)
 *  2+22*10(22是上一个算式的和)
 *  2+222*10(222是上一个算式的和)
 *  2+2222*10(2222是上一个算式的和)
 *  累加,一个累加求这几个数,一个累加求和.
*/
public class ValueSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = sc.nextInt();
		int a = 0, sum = 0;
		for (int i = 1; i <= 5; i++) {
			a = a * 10 + num;
			sum += a;
		}
		System.out.println(sum);
	}
}
