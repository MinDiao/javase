package com.hpe.day01;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		System.out.println("请输入学生的成绩");
		int sc = new Scanner(System.in).nextInt();
		if (sc >= 60) {
			if (sc >=90) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		} else {
			System.out.println("C");
		}
	}
}
