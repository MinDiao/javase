package com.hpe.day04;

import java.util.Scanner;

/*
 *  实验一
	企业发放的奖金根据利润提成。
	利润低于或等于10万元时，奖金可提10%；
	利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
	20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
	60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成；
	从键盘输入当月利润，求应发放奖金总数；
	使用if条件语句输出相应的结果

 */
public class Profit {
	public static void main(String[] args) {
		//键盘输入利润
		System.out.println("请输入单位:万元");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		//奖金
		double value = 0;
		//利润低于或等于10万元时
		if(money < 10) {
			value = money * 0.1;
		} else if (money > 10 && money < 20) {
			//利润高于10万元，低于20万元时
			value = 10 * 0.1 + (money - 10) * 0.075;
		} else if(money > 20 && money < 40) {
			//20万到40万之间时
			value = (money - 20) * 0.05;
		} else if(money > 40 && money < 60) {
			//40万到60万之间时
			value = (money - 40) * 0.03;
		} else if(money > 100 && money < 60) {
			//60万到100万之间时
			value = (money - 60) * 0.015;
		} else if(money > 100) {
			//超过100万元
			value = (money - 100) * 0.01;
		}
		System.out.println("奖金为:"+ value*10000 +"元");
	}
}








/*
//利润低于或等于10万元时，奖金可提10%；
		if (money <= 10) {
			value = money * 0.1;
			System.out.println(value);
		} else if(money > 10 && money < 20) {
			//利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
			
		}*/




