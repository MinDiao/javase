package com.hpe.day07;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//定义包含5个学生的数组
		Student[] s = new Student[2];
		for (int i = 1; i <= s.length; i++) {
			System.out.println("请输入第"+i+"个学生的学号：");
			int sNo = sc.nextInt();
			System.out.println("请输入第"+i+"个学生的姓名：");
			String sName = sc.next();
			System.out.println("请输入第"+i+"个学生的性别：");
			String sSex = sc.next();
			System.out.println("请输入第"+i+"个学生的年龄：");
			int sAge = sc.nextInt();
			System.out.println("请输入第"+i+"个学生的成绩：");
			double sJava = sc.nextDouble();
			s[i-1] = new Student(sNo,sName,sSex,sAge,sJava);
		}
		
		/*平均成绩和求最大最小值*/
		double max = s[0].getsJava();
		double min = s[0].getsJava();
		double average = 0;
		for (int i = 0; i < s.length; i++) {
			average += s[i].getsJava();
			if (s[i].getsJava() > max) {
				max = s[i].getsJava();
			} 
			if (s[i].getsJava() < min) {
				min = s[i].getsJava();
			}
		}
		System.out.println("最大值："+ max);
		System.out.println("最小值："+ min);
		System.out.println("平均值："+ average / s.length);
		System.out.println(new Student().toString());
	}
}
