package com.hpe.day11;

public class ZhengFangXing extends XingZhuang {
	double bianchang;//正方形的边长
	@Override
	public double getArea() {
		area = bianchang * bianchang;
		return area;
	}
}
