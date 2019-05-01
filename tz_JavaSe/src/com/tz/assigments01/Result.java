package com.tz.assigments01;
/*
 * 	编写程序接收用户输入分数信息，如果分数在0—100之间， 输出成绩。如果成绩不在该范围内， 抛出异常信息，提示分数必须在0—100之间。
 * 	要求：使用自定义异常实现
 */
import java.util.Scanner;

class Custom extends Exception { //自定义异常:继承异常类
	public Custom(String msg){ //创建构造方法
		super(msg);
	}
}

public class Result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入分数");
		try {
			int a = sc.nextInt();
			if (a < 0 || a > 100) { //限制范围
				throw new Custom("分数的范围为0~100"); //抛出异常
			} else {
				System.out.println("分数为:"+ a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
