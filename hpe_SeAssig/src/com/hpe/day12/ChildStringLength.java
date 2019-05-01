package com.hpe.day12;

import java.util.Scanner;

/*
 * 	题目：计算字符串中子串出现的次数 
 */
public class ChildStringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入父字符串和子字符串");
		String dad = sc.next();
		String son = sc.next();
		//计次
		int count = 0;
		//子字符串小于父字符串
		while (son.length() <= dad.length()) {
			//子字符串在父字符串索引中不为空
			if (dad.indexOf(son) != -1) {
				dad = dad.substring(dad.indexOf(son) + son.length(), dad.length());
				count++;
			} else {
				break;
			}
			
		}
		System.out.println("出现"+ count +"次");
	}

}
