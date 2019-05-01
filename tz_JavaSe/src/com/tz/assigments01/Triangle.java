package com.tz.assigments01;
/*
 * 	写一个方法void triangle(int a,int b,int c)， 判断三个参数是否能构成一个三角形。 
 * 	如果不能则抛出异常IllegalArgumentException
 */
import java.util.Scanner;

class Distinguish {
	void triangle(int a,int b,int c) throws Exception{
		if ((a+b)>c && (a+c)>b && (c+b)>a) { //判断三边的关系
			System.out.println("能够成三角形");
		} else {
			throw new IllegalArgumentException("不能构成三角形"); //抛出异常
		}
	}
}

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Distinguish dt = new Distinguish();
		System.out.println("请输入三角形的三条边");
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			dt.triangle(a,b,c); //调用方法
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
