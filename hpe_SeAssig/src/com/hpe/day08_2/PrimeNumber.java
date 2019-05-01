package com.hpe.day08_2;

public class PrimeNumber {
	public static void main(String[] args) {
		int m = 0;
		for (int i = 2; i < 100; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					m++;
				}
			}
			if (m == 2) {
				System.out.print(i +" ");
			}
			m = 0;
		}
	}
}
