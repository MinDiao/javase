package com.hpe.day02;
/*
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？   
这是一个菲波拉契数列问题

 */
public class T_Rabbit {
	public static void main(String[] args) {
		int num1 = 1;//表示第一个月1对，上上个月的兔子对数
		int num2 = 1;//表示第二个月1对，上个月的兔子对数
		for (int i = 3; i <= 12; i++) {
			//先算第i个月的兔子对数
			int num3 = num1 + num2;
			System.out.println(i +"月份"+ num3 +"对兔子");
			//为了计算下个月，需要先获取钱两个月的兔子对数
			num1 = num2;//想用num1表示上上个月的兔子对数，将num2交给上上个月进行保存
			num2 = num3;//用num2表示上个月的兔子对数
		}
	}
}
