package com.hpe.day02;

import java.util.Scanner;
/*
 * 利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，
 * 60-89分之间的用B表示，60分以下的用C表示。 
 */
public class TM_Result {
	public static void main(String[] args) {
		//键盘输入成绩
		int sc = new Scanner(System.in).nextInt();
		//使用if嵌套循环实现对成绩的选取
		//1、大于等于90分与60-89分之间的共性是都大于60分，所以先进入60分
		if (sc > 60) {
			//2、进入60分后，选取小于89分，则结果为60-89之间的分数
			if (sc < 89) {
				System.out.println("B");
			} else {
				//3、大于60分，且不包含60-89之间的分数则为大于90分的成绩
				System.out.println("A");
			}
		} else if(sc < 0) {
			System.out.println("您输入的成绩不正确");
		} else {
			//4、不大于60分的数则为60分以下
			System.out.println("C");
		}
		
		
		
	}
}
