package com.hp.assigments02;

public class Remainder {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 ==2 && i % 5 == 3 && i % 7 == 2) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
