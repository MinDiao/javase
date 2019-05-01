package com.hpe.day10;
/*
 *  点类（Point）,包含数据成员x,y(坐标点)；
	派生出了圆类Circle，增加数据成员r(半径)，有计算面积的方法；
	圆类派生出了圆柱体类（Cylinder），增加了数据成员h(高)，重写计算面积的方法，有计算体积的方法。
	设计测试类，测试圆柱功能。
 */
public class Point {
	double x;
	double y;
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}
