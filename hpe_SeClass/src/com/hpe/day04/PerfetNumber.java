package com.hpe.day04;
/*
 * 一个数如果恰好等于它的因子之和，
 * 这个数就称为 "完数 "。例如6=1＋2＋3
 * 编程找出1000以内的所有完数。
 */
public class PerfetNumber {
	public static void main(String[] args) {
		//循环遍历1-1000
		for (int i = 1; i < 1000; i++) {
			int sum = 0;//因子之和
			//判断当前数字，是否为完数
				//找出该数的所有因子
					//从1一直循环到当前这个数，用该数与迭代变量求余，余数为0则为因子
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
				//求出所有因子的和
				//因子之和是否等于该数本身
			if (sum == i) {
				System.out.println(i);
			}
			//如果是完数，打印输出
		}
	}
}
