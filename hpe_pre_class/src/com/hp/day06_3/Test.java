package com.hp.day06_3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//测试一，使用set方法给成员变量赋值
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数");
		int num2 = sc.nextInt();
		//实例化对象
		Demo d = new Demo();
		d.setNum1(num1);
		d.setNum2(num2);
		System.out.println(d.Sum());
	}
}
