package com.hp.day03;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(add(0));
	}
	static int add(int count) {
		int temp = count;
		count = count + 1;
		return temp;
	}
}
