package com.tz.assigments03;
/*
 * 2、 用 while 循环求 n平方  大于 12000 的最小数 n 。 
 */

public class While {
	public static void main(String[] args) {
		//方法一:
		int n = 0;
		while (n * n < 12000) {
			n++;
		}
		System.out.println("n最小值为:"+ n);
		
		//方法二:
		int n1 = 0;
		while(true) {
			int sum = n1 * n1;
			if (sum > 12000) {
				break;
			}
			n1++;
		}
		System.out.println("n最小值为:"+ n1);
	}
}
