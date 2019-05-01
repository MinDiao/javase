package com.tz.assigments04;
/*
 * 6、关于String类的练习题，分析运行结果？
 */
public class Sixth {
	private static void demo4() {
		byte b = 3 + 4; 
		System.out.println(b); //输出7
		String s1 = "a" + "b" + "c";
		String s2 = "abc";
		System.out.println(s1 == s2); //输出true
		System.out.println(s1.equals(s2)); //输出true
	}
	private static void demo3() {
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println(s1 == s2); //输出false
		System.out.println(s1.equals(s2)); //输出true
	}
	private static void demo2() {
		String s1 = new String("abc");
		System.out.println(s1); //输出abc
	}
	private static void demo1() {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2); //输出true
		System.out.println(s1.equals(s2)); //输出true
	}
	public static void main(String[] args) {
		demo4();
		demo3();
		demo2();
		demo1();
	}
}
