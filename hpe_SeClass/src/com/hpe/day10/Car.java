package com.hpe.day10;
/*
 * 	汽车类，包含run()方法。Benz类和JD类为派生类。Benz在以200迈的速度在run，JD在以80迈的速度在run。
	有个人类，有汽车属性，包含drive方法，能开任何型号的车。
	测试类，创建一个人，先开一辆Benz，再开一辆JD。
 */
public class Car {
	public void run() {
		System.out.println("车运行");
	}
}
