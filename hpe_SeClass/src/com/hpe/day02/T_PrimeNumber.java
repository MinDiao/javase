package com.hpe.day02;
/*
 * 题目：判断101-200之间有多少个素数，并输出所有素数。 
程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数。

 */
public class T_PrimeNumber {
	public static void main(String[] args) {
		//第一步：循环遍历101-200
		for (int i = 101; i < 200; i+=2) {
			boolean flag = true;//使用该变量来保存是否为素数，先假设为素数
			//第二步：循环遍历过程中判断该数是否为素数
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			//打印输出素数
			if (flag) {
				System.out.println(i);
			}
		}
	}
}
