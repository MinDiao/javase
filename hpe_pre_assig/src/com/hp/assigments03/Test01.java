package com.hp.assigments03;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		/*System.out.println(toSum(2,3));
		System.out.println(max(3.5,6.5));
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		System.out.println(max2(x2,y2));*/
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int z3 = sc.nextInt();
		equals2(x3,y3,z3);
	}
	public static int toSum(int a,int b){
		int sum = a + b;
		return sum;
	}
	public static double max(double x,double y){
		return x > y ? x : y;
		/*if(x > y){
			return x;
		} else {
			return y;
		}*/
	}
	public static double max2(double x2,double y2){
		return x2 > y2 ? x2 : y2;
		/*if(x > y){
			return x;
		} else {
			return y;
		}*/
	}
	public static boolean equals(int a,int b){
		return a == b ? true : false;
	}
	public static int equals2(int a,int b,int c){
		/*int max = a;
		if(b > max){
			max = b;
			System.out.println("最大值是"+ max);
		} if (c > max){
			max = c;
			System.out.println("最大值是"+ max);
		}*/
		if(a>b){
			return a>c?b:c;
		}else{
			return b>c?b:c;
		}
	}
}
