package com.hpe.day02;

import java.util.Scanner;

/*
 * 输入两个正整数m和n，求其最大公约数和最小公倍数。   
 * 思路:在循环中，只要除数不等于0，用较大数除以较小的数，
 * 将小的一个数作为下一轮循环的大数，取得的余数作为
 * 下一轮循环的较小的数，如此循环直到较小的数的值为0，
 * 返回较大的数，此数即为最大公约数，最小公倍数为两数
 * 之积除以最大公约数。
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
public class CommonDivisor {
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
