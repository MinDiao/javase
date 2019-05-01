package com.hpe.day16;

public class B extends A {

	@Override
	public int fun(int a, int b) throws ArithmeticException {
		System.out.println("子类的方法");
		return a / b;
	}
	
}
