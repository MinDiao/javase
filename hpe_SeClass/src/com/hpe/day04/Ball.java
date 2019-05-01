package com.hpe.day04;
/*
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
public class Ball {
	public static void main(String[] args) {
		//一共经过的长度
		double sum = 100;
		//下落的长度
		double down = 100;
		//反弹的长度
		double rebound = 0;
		for (int i = 0; i < (10-1); i++) {
			rebound = down / 2;
			down = rebound;
			sum += down + rebound;
		}
		System.out.println("一共经过"+ sum +"米 ");
		System.out.println(down/2);
	}
}
