package com.hpe.day07;
/*
 * 	使用递归方法求5!
 * 	解: 5!=5*4*3*2*1
 */
public class FiveFive {
	public static int fun(int n) {
		//n! = n*((n-1)!)
		if (n == 1) {
			return 1;//跳出递归的分支语句
		}
		if (n > 1) {
			return n * fun(n - 1);
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(fun(5));
	}
}
