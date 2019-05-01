package com.hpe.day04;

import java.util.Scanner;

/*
 * 使用switch实现菜单跳转
	从登录菜单跳转到主菜单
	登录菜单：1.登录系统		2.退出
	主菜单：  1.读者信息管理	2.图书信息管理
		        3.借阅管理		4.注销
*/
public class BMS_class {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//有三次登录机会
		for (int i = 0; i < 3; i++) {
			login();
		}
	}
	
	//验证系统
	public static void login() {
		System.out.println("欢迎登录");
		
	}
	
	//运行系统
	public static void run() {
		
	}
}
