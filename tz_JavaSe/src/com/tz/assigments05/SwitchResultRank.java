package com.tz.assigments05;

import java.util.Scanner;
/*
 * switch的成绩归类
 */
public class SwitchResultRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入成绩:");
		Scanner sc = new Scanner(System.in);
		while (true) {
			int score = sc.nextInt();
			switch (score / 10) {
			case 10:
			case 9:
				System.out.println("成绩为:A");
				break;
			case 8:
				System.out.println("成绩为:B");
				break;
			case 7:
				System.out.println("成绩为:C");
				break;
			case 6:
				System.out.println("成绩为:D");
				break;
			default:
				System.out.println("加油");
				break;
			}
		}
	}

}
