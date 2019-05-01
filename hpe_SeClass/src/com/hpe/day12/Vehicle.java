package com.hpe.day12;
/*
 * 创建一个Vehicle类并将它声明为抽象类。在Vehicle类中
 * 声明一个名为run的实现打印”Running”功能的方法和一个
 * 名为wheelsNum的抽象方法，该方法没有返回值。创建两个
 * 类Car和Motorbike，均继承自Vehicle，并在这两个类中
 * 实现wheelsNum方法。在Car类中应当显示“四轮车”信息，
 * 而在Motorbike类中应当显示“双轮车”信息。创建另一个
 * 带main方法的类Test，在其main方法中使用多态的方式分别
 * 调用Car和Motorbike中的wheelsNum方法以及run方法。
 */
public abstract class Vehicle {
	public void run() {
		System.out.println("Running");
	}
	public abstract void wheelsNum();
}
