package com.hpe.day04;
/*
 * 	算出从1到100中奇数相加的结果，并打印到控制台
	使用while循环语句和continue流程控制语句完成实验
	奇数为不能被2整除的数
 */
public class OddNumberSum {
	public static void main(String[] args) {
		//方法一：
		//初始化循环值与总数
		int i = 1, sum = 0;
		while(i <= 100) {
			//遇到奇数记下来
			if(i % 2 != 0) {
				//赋值到总数
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		
		//方法二
		int i2 = 0, sum2 = 0;
		while (i2 < 100) {
			i2++;
			//遇到偶数跳过
			if (i2 % 2 == 0) {
				continue;
			}
			sum2 += i2;
		}
		System.out.println(sum2);
	}
}
