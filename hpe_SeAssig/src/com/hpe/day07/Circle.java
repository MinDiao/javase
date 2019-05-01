package com.hpe.day07;

import java.util.Scanner;

public class Circle {
	private double Radius;
	public Circle() {
		this.Radius = 0;
	}
	public Circle(double r) {
		this.Radius = r;
	}
	public void setRadius(double r) {
		this.Radius = r;
	}
	public double getRadius() {
		return Radius;
	}
	/*获取圆的面积*/
	public double getArea() {
		double r = this.Radius;
		return Math.PI * Math.sqrt(r);
	}
	/*获取圆的周长*/
	public double getPerimeter() {
		double r = this.Radius;
		return Math.PI * (r * 2);
	}
	/*将圆的半径、周长、面积输出到屏幕*/
	public void show() {
		Scanner sc = new Scanner(System.in);
		this.setRadius(sc.nextDouble());
		//输出半径
		System.out.println(this.getRadius());
		//输出周长
		System.out.println(this.getArea());
		//输出面积
		System.out.println(this.getPerimeter());
		sc.close();
	}
}
