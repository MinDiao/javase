package com.hpe.day01;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 0;
		boolean flag = false;
		for (int i = 101; i < 200; i++) {
			for (int j = 2; j < Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				num++;
				System.out.println("素数是:"+ i);
			}
			flag = false;
		}
		System.out.println("素数个数"+ num);
	}
}
