package com.hpe.day11;

public class YuanXing extends XingZhuang {
	double r;//半径
	public YuanXing(double r) {
		this.r = r;
	}
	@Override
	public double getArea() {
		//因为这是个具体的形状，我们可以根据圆形的特性，来求取其面积
		area = Math.PI * r * r;
		return area;
	}
}
