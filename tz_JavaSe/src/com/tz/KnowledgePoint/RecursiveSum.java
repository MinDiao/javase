package com.tz.KnowledgePoint;
/*
 * 	递归求和
 */
public class RecursiveSum {
	int sum = 0;
	int a = 1;
	public void sum() {
		sum += a;
		a++;
		if (a <= 100) {
			sum();
		}
	}
	public static void main(String[] args) {
		RecursiveSum rs = new RecursiveSum();
		rs.sum();
		System.out.println(rs.sum);
	}
}
