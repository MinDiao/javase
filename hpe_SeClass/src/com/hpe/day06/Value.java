package com.hpe.day06;

public class Value {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		change(a, b);
		System.out.println("a:"+ a +"b:"+ b);
	}
	public static void change(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
}
