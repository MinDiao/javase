package com.hpe.day10;
/*
 * 交通工具（能行驶，刹车），交通工具包括自行车，汽车，摩托车，而且它们都能行驶，能刹车。
	定义交通工具类
	分别定义自行车、汽车、摩托车类，重写行驶、刹车方法。
 */
public class Vehicle {
	//行驶
	public void run() {
		System.out.println("行驶");
	}
	//刹车
	public void brake() {
		System.out.println("刹车");
	}
}
