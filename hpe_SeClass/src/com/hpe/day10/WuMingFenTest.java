package com.hpe.day10;

public class WuMingFenTest {
	public static void main(String[] args) {
		WuMingFen f1 = new WuMingFen("牛肉",3,true);
		f1.check();
		WuMingFen f2 = new WuMingFen("牛肉",2);
		f2.check();
		WuMingFen f3 = new WuMingFen();
		f3.check();
	}
}
