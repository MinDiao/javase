package com.hpe.day10;

public class Cylinder extends Circle {
	double h;
	public Cylinder(double x, double y, double r, double h) {
		super(x,y,r);
		this.h = h;
	}
	public double area() {
		return Math.PI * Math.sqrt(r);
	}
	public void volume() {
		System.out.println("圆柱的体积为："+ this.area() * this.h);
	}
}
