package com.hp.assigments05;

public class MyMath {
	private int num1;
	private int num2;
	public MyMath(int num1,int num2) {
		this.setNum1(num1);
		this.num2 = num2;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum2() {
		return num2;
	}
	
	//加
	public void adds() {
		System.out.println(num1 + num2);
	}
	//减
	public void minus() {
		System.out.println(num1 - num2);
	}
	//乘
	public void multiplication() {
		System.out.println(num1 - num2);
	}
	//除
	public void division() {
		if (num2 != 0) {
			System.out.println(num1 / num2);
		} else {
			System.out.println("被除数不能为0");
		}
	}
}


	

