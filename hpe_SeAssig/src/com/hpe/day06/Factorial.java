package com.hpe.day06;
/*
 * 题目：求1+2!+3!+...+20!的和
 * 就是求1到20阶乘的和
 * 即:1+2*1+3*2*1+4*3*2*1+5*4*3*2*1+......+20*19*18*17*16*15...*3*2*1
 */
public class Factorial {
	public static void main(String[] args) {
		//初始化
		int n = 1;
		long sum = 0;
		for (int i = 1; i <= 20; i++) {
			n = n * i;//把注释的式子逆过来看
			sum += n;
		}
		System.out.println(sum);
	}
}
