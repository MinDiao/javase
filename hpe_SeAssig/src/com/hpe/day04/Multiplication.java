package com.hpe.day04;
/*
 *  使用for循环语句打印九九乘法表
 */
public class Multiplication {
	public static void main(String[] args) {
		//外层for控制行
		for(int i = 1; i <= 9; i++) {
			//内层for控制列
			for(int j = 1; j <= i; j++) {
				System.out.print(j +"*"+ i +"="+ i * j +"\t");
			}
			//换行
			System.out.println();
		}
	}
}
