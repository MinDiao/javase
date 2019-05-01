package com.hpe.day16;
/*父类*/
public class A {
	public int fun(int a, int b) throws RuntimeException {
		System.out.println("父类的方法");
		int c = a / b;
		return c;
	}
}
