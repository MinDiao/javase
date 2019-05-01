/**
 * 
 */
package com.zw.view;

import java.util.Scanner;

/** 
 * 	类描述：程序入口
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月5日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class MainUI {

	/** 
	 * 	方法描述：界面
	 * 	@param args
	 */
	//设置输入的静态方法,因为main也是静态方法
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		while (true) {
			System.out.println("---------------个人资产管理系统----------------");
			System.out.println("------------------1.管理员-------------------");
			System.out.println("------------------2.顾客-------------------");
			System.out.println("------------------3.退出-------------------");
			System.out.println("请选择业务：");
			String result = sc.next();
			switch (result) {
			case "1":
				//管理员登录
				AdminUI.login();
				break;
				
			case "2":
				//顾客登录
				UserUI.userLogin();
				break;	
				
			case "3":
				//退出
				System.out.println("谢谢使用");
				sc.close();
				System.exit(0);
				break;	
				
			default:
				//输入错误
				System.out.println("输入错误,请重新输入:");
				break;
			}
		}

	}

}
