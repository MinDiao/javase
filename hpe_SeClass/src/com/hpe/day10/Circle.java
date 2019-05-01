package com.hpe.day10;

public class Circle extends Point {
	double r;
	public Circle(double x, double y, double r) {
		super(x,y);
		this.r = r;
	}
	//计算面积
	public double area() {
		return Math.PI * Math.sqrt(r);
	}
}
