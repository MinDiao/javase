package com.hpe.day16;

public class Zero2 {
	public static double fun(int a, int b) throws ArithmeticException {
		double c = a / b;
		return c;
	}
	public static void main(String[] args) throws ArithmeticException {
		int a = 1;
		int b = 0;
		//如果调用者不想处理异常
		double c = fun(a, b);
		System.out.println(c);
		
	}
}
