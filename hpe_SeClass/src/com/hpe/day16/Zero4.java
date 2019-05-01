package com.hpe.day16;

public class Zero4 {
	public static double fun(int a, int b) throws MyException {
		//判断b == 0
		if (b == 0) {
			throw new MyException("除数不能为0");
		}
		System.out.println(123);
		double c = a / b;
		return c;
	}
	public static void main(String[] args) throws ArithmeticException {
		int a = 1;
		int b = 0;
		try {
			double c = fun(a, b);
			System.out.println(c);
		} catch (MyException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
