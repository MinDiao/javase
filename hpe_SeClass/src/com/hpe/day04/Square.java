package com.hpe.day04;
/*
 * 一个整数，它加上100后是一个完全平方数，
 * 再加上168又是一个完全平方数，请问该数是多少？
 */
public class Square {
	public static void main(String[] args) {
		for (int i = -1000; i < 10000; i++) {
			for (int a = -1000; a < (i + 100); a++) {
				if (a * a == (i + 100)) {
					//TODO
				}
			}
		}
	}
}
