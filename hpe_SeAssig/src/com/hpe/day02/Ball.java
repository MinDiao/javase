package com.hpe.day02;
/*
 * 一球从100米高度自由落下,每次落地后反跳回原高度的一半;
 * 再落下,求它在第10次落地时,共经过多少米？第10次反弹多高?
 */
public class Ball {
	public static void main(String[] args) {
		//初始化弹跳需要经过的长度
		double count = 0;
		//初始化刚开始的高度
		double height = 100;
		//限制循环10此落地
		for (int i = 1; i <= 10; i++) {
			//统计需要经过的高度
			count += height;
			//因为弹跳是双次，所以需要/2
			height /= 2;
		}
		//输出
		System.out.println("共经过:"+ count +"米");
		System.out.println("第10次反弹:"+ height +"米");
	}
}
