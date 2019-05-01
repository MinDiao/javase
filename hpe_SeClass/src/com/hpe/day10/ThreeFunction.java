package com.hpe.day10;
/*
 * 创建一个类，为该类定义三个构造函数，分别执行下列操作：
	传递两个整数值并找出其中较大的一个值
	传递三个double值并求出其乘积
	传递两个字符串值并检查其是否相同
	在main方法中测试构造函数的调用。
 */
public class ThreeFunction {
	int n1;
	int n2;
	double d1;
	double d2;
	double d3;
	String s1;
	String s2;
	/*1.传递两个整数值并找出其中较大的一个值*/
	public ThreeFunction(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	/*2.传递三个double值并求出其乘积*/
	public ThreeFunction(double d1, double d2, double d3) {
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}
	/*传递两个字符串值并检查其是否相同*/
	public ThreeFunction(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	//判断输出
	/*1.传递两个整数值并找出其中较大的一个值*/
	public void run() {
		System.out.println(n1 > n2 ? n1 : n2);
	}
	/*2.传递三个double值并求出其乘积*/
	public void run1() {
		System.out.println(d1 * d2 * d3);
	}
	
	/*传递两个字符串值并检查其是否相同*/
	public void run2() {
		System.out.println(s1 == s2);
	}
}
