package com.hpe.day16;

public class Zero {
	public static double fun(int a, int b) throws ArithmeticException {
		/*if (b == 0) {
			throw new ArithmeticException("算术异常");
		}*/
		//double参与运算要注意，b转为double后计算后结果为无穷大
		double c = /*1.0* */ a / b;
		return c;
	}
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		//如果调用者想处理异常
		try {
			double c = fun(a, b);
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
