package com.hpe.day04;
/*
 * 使用switch实现菜单跳转
	从登录菜单跳转到主菜单
	登录菜单：1.登录系统		2.退出
	主菜单：  1.读者信息管理	2.图书信息管理
		        3.借阅管理		4.注销
 */
import java.util.Scanner;

public class BMS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1、登录系统");
		System.out.println("2、退出");
		System.out.println("请输入:");
		int x=sc.nextInt();
		
		switch(x) {
			case 1:System.out.println("登录系统");//case中嵌套switch
				System.out.println("1、读者信息管理");
				System.out.println("2、图书信息管理");
				System.out.println("3、借阅管理");
				System.out.println("4、注销");
				System.out.println("请输入:");
				int y=sc.nextInt();
				switch(y) {
					case 1:System.out.println("1、读者信息管理");break;
					case 2:System.out.println("2、图书信息管理");break;
					case 3:System.out.println("3、借阅管理");break;
					case 4:System.out.println("4、注销");break;
					default:System.out.println("输入错误");break;
				}
			case 2:System.out.println("已退出");break;
			default:System.out.println("输入错误，请返回");break;
		}       
	}
}
