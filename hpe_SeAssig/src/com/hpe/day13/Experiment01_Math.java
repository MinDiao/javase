package com.hpe.day13;
/*
 * 	实验任务
	计算数的绝对值，两个值比较大小，取0~1之间随机数
 */
public class Experiment01_Math {
	/*计算-10.4的绝对值*/
	public static double absoluteValue(double num) {
		return Math.abs(num);
	}
	
	/*比较55, -10两个数哪个小*/
	public static int Min(int a, int b) {
		return Math.min(a, b);
	}
	
	/*比较0.0, -0.0两个数哪个大*/
	public static double Max(double d, double e) {
		return Math.max(d, e);
	}
	
	/*取0~1之间随机数*/
	public static double Ran() {
		return Math.random() ;
	}

	
	public static void main(String[] args) {
		System.out.println(absoluteValue(-10.4));
		System.out.println(Min(55, -10));
		System.out.println(Max(0.0, -0.0));
		System.out.println(Ran());
	}
}
