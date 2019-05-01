/**
 * 
 */
package com.life.view;

import java.util.Scanner;

/** 
 * 	类描述：入口
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月10日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class MainUI {
	
	// 键盘输入
	private static Scanner sc = new Scanner(System.in);
	/** 
	 * 	方法描述：登录、注册main方法
	 * 	@param args
	 */
	public static void main(String[] args) {
		while (true) {
			System.out.println("----------个人生活助手平台----------");
			System.out.println("----------1.登录----------");
			System.out.println("----------2.注册----------");
			System.out.println("----------0.退出----------");
			System.out.println("请选择:");
			// 接收选择的功能
			String input = sc.next();
			switch (input) {
				case "1":
					UsersUI.login();
					break;
					
				case "2":
					UsersUI.insertUsers();
					break;
					
				case "0":
					System.out.println("谢谢使用个人生活助手平台");
					sc.close();
					System.exit(0);
					break;
					
				default:
					System.out.println("输入有误,请重新输入");
					break;
			}
		}
	}
	
	

}
