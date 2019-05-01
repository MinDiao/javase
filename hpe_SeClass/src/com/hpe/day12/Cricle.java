package com.hpe.day12;

public class Cricle implements Shape2D {
	double r;//圆类的半径
	public Cricle(double r) {
		this.r = r;
	}
	//重写接口的周长方法
	public void grith() {
		System.out.println("圆周长为："+ PI * r * 2);
	}
	//重写接口的面积方法
	public void area() {
		System.out.println("圆面积为："+ PI * r * r);
	}
}
