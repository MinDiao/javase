package com.hpe.day03;

import java.util.Scanner;

/*
 * 由控制台输入月份和日期，计算该日期是今年第多少天
 */
public class DataDemo {
	public static void main(String[] args) {
		//1获取控制台输入的月份和日期
		//1.1先获取月份
		System.out.println("请输入月份:");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		//1.2再获取日期
		System.out.println("请输入日期:");
		int day = input.nextInt();
		//2判断该日期是今年的多少天:先计算几个月的总天数,然后再加上日期即为多少天/
		int sum = 0;//总天数
		//2.1由于月份比较固定，使用switch语句来判断月份比较合适*/
		switch(month) {
			case 12:
				sum += 30;
			case 11:
				sum += 31;
			case 10:
				sum += 30;
			case 9:
				sum += 31;
			case 8:
				sum += 31;
			case 7:
				sum += 30;
			case 6:
				sum += 31;
			case 5:
				sum += 30;
			case 4:
				sum += 31;
			case 3:
				sum += 28;
			case 2:
				sum += 31;
			default://一月
				sum += day;
				break;
		}
		System.out.println(month+"月"+day+"日是今年的第"+sum+"天");
		//释放资源
		input.close();
	}
}
