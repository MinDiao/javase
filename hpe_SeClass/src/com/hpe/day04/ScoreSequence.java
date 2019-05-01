package com.hpe.day04;
/*
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...
 * 求出这个数列的前20项之和。
 */
public class ScoreSequence {
	public static void main(String[] args) {
		double n = 1.0, m = 2.0, sum = 0.0;
		for (int i = 0; i < 20; i++) {
			double temp = m;
			sum += m / n;
			m = m + n;
			n = temp;
		}
		System.out.println(sum);
	}
}
