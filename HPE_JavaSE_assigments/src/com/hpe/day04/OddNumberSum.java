package com.hpe.day04;
/*
 * 	算出从1到100中奇数相加的结果，并打印到控制台
	使用while循环语句和continue流程控制语句完成实验
	奇数为不能被2整除的数
 */
public class OddNumberSum {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		while(i <= 100) {
			if(i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
