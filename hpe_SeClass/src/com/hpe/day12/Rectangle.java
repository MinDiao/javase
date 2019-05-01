package com.hpe.day12;

public class Rectangle implements Shape2D {
	double c;//矩形的周长
	double k;//矩形的面积
	public Rectangle(double c, double k) {
		this.c = c;
		this.k = k;
	}
	//重写接口的周长方法
	public void grith() {
		System.out.println("矩形的周长为："+  (c + k) * 2);
	}
	//重写接口的面积方法
	public void area() {
		System.out.println("矩形的面积为："+ c * k);
	}
}
