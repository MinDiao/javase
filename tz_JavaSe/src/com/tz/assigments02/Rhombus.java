package com.tz.assigments02;
/*
 * 打印菱形
 */
public class Rhombus {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) { //外层循环,控制行数
			if (i == 3) {
				continue; //跳出本次循环
			}
			for (int j = 3; j >= i; j--) { //输出空格
				System.out.print(" ");
			}
			for (int k = 1; k <= (i*2-1); k++) { //输出*
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i+1; j++) { //输出空格
				if (i == 3) {
					continue;
				}
				System.out.print(" ");
			}
			if (i ==2) { //输出*
				continue;
			}
			for (int k = 3; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
