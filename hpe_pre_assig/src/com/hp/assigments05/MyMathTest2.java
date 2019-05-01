package com.hp.assigments05;

import java.util.Scanner;

public class MyMathTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数");
		int num2 = sc.nextInt();
		
		MyMath m = new MyMath(num1,num2);
		m.adds();
		m.minus();
		m.multiplication();
		m.division();
	}

}
