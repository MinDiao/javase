package com.tz.assigments03;
/*
 * 3、 打印 2 到 10000 的所有素数，每行显示 8个素数
 */

public class PrimeNumber {
	public static void main(String[] args) {
		int k = 0; //换行变量
		int m = 0; //判断变量
		for (int i = 2; i < 10000; i++) {
			for (int j = 1; j <= i; j++) { //比较10000范围内的所有质数
				if (i % j == 0) {
					m++;
				}
			}
			if (m == 2) { //当m为2时,i为质数
				k++;
				System.out.print(i +"\t");
			}
			m = 0; //初始化判断变量
			if (k == 8) { //当k的值到8时,自动换行
				k = 0;
				System.out.println();
			}
		}
	}
}
