package com.hpe.day01;

public class Daffodil {
	public static void main(String[] args) {
		int a,b,c;
		int d = 0;
		for (int i = 100; i <= 999; i++) {
			a = i % 10;
			b = i / 10 % 10;
			c = i / 100;
			if (i == a*a*a + b*b*b + c*c*c) {
				System.out.println(i);
				d++;
			}
		}
		System.out.println(d);
	}
}
