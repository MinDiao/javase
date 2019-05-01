package com.hpe.day01;
/*
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，
 * 60-89分之间的用B表示，60分以下的用C表示。   
 */
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
