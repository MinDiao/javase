package com.hpe.day10;
/*
 * 为“无名的粉”写一个类：class WuMingFen 要求：
	有三个属性：
	面码:String theMa  
	粉的分量(两)：int quantity 
	是否带汤：boolean likeSoup
	1、写一个构造方法，以便于简化初始化过程，如：
		WuMingFen f1 = new WuMingFen("牛肉",3,true);
	2、重载构造方法，使得初始化过程可以多样化：
		WuMingFen f2 = new WuMingFen("牛肉",2);
	3、如何使得下列语句构造出来的粉对象是酸辣面码、2两、带汤的？
		WuMingFen f3 = new WuMingFen();
	写一个普通方法：check()，用于查看粉是否符合要求。即：将对象的三个属性打印在控制台上。

 */
public class WuMingFen {
	String theMa;
	int quantity;
	boolean likeSoup;
	//1
	public WuMingFen(String theMa, int quantity, boolean likeSoup) {
		this.theMa = theMa;
		this.quantity = quantity;
		this.likeSoup = likeSoup;
	}
	//2
	public WuMingFen(String theMa, int quantity) {
		this.theMa = theMa;
		this.quantity = quantity;
	}
	//3
	public WuMingFen() {
		this.theMa = "酸辣";
		this.quantity = 2;
		this.likeSoup = true;
	}
	public void check() {
		System.out.println(this.theMa+" "+this.quantity+" "+this.likeSoup);
	}
}
