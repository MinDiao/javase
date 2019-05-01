/**
 * 
 */
package com.life.view;

import java.util.Date;
import java.util.Scanner;

import com.life.dao.IUsersDao;
import com.life.dao.impl.UsersDaoImpl;
import com.life.po.Users;
import com.life.service.IUsersService;
import com.life.service.impl.UsersServiceImpl;

/** 
 * 	类描述：用户登录,菜单表示层
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月10日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class UsersUI {
	
	// 键盘输入
	private static Scanner sc = new Scanner(System.in);
	// 实现用户服务层
	private static IUsersService userservice = new UsersServiceImpl();
	// 实现用户数据逻辑层
	private static IUsersDao userdao = new UsersDaoImpl();
	// 初始化实体类创建实体类的成员变量,用户接收方法执行的参数
	public static Users users1 = new Users();
	
	// 用户登录
	public static void login(){
		// 初始化输入次数
		int inputCount = 3;
		while (true) {
			System.out.println("----------个人生活助手平台----------");
			System.out.println("----------用户登录----------");
			System.out.println("请输入用户名:");
			String name = sc.next();
			System.out.println("请输入密码:");
			String psw = sc.next();
			// 实例化实体类并传入参数
			Users users = new Users();
			users.setUserName(name);
			users.setUserPassword(psw);
			
			// 接收参数
			users1 = userservice.login(users);
			
			// 判断是否登录成功
			if (users1 != null) {
				System.out.println("登录成功");
				
				// 临时实体类变量接收用户id属性
				users1.setUserId(userdao.selectUsersName(users1.getUserName()).getUserId());
				
				// 进入菜单
				menu();
				//停止循环并返回方法调用处
				return;
			} else {
				if (--inputCount > 0) {
					System.err.println("用户名或密码错误,还有"+(inputCount)+"次机会");
				} else {
					System.out.println("连接输入三次有误,请确认后登录!");
					// 停止循环并返回方法调用处
					return;
				}
			}
		}

	}

	// 用户注册
	public static void insertUsers(){
		while (true) {
			System.out.println("----------个人生活助手平台----------");
			System.out.println("----------用户注册----------");
			System.out.println("请输入用户名:");
			String name = sc.next();
			System.out.println("请输入密码:");
			String psw = sc.next();
			System.out.println("请输入真实姓名:");
			String realname = sc.next();
			System.out.println("请输入电话:");
			String tel = sc.next();
			System.out.println("请输入地址:");
			String address = sc.next();
			// 实例化实体类并传递参数属性
			Users users = new Users(name, psw, realname, tel, address, new Date());
			// 初始化接收的参数
			boolean result = false;
			// 接收参数
			result = userservice.insertUsers(users);
			// 判断是否添加\组成成功
			if (result) {
				System.out.println("注册成功");
				
				// 接收参数
				users1 = users;
				// 接收id属性
				users1.setUserId(userdao.selectUsersName(users1.getUserName()).getUserId());
				// 进入菜单
				menu();
				return;
			} else if(result == false) {
				System.err.println("该用户名已经存在,请重新注册!");
				return;
			} else{
				System.out.println("注册失败");
				return;
			}
		}
		
	}
	
	// 菜单
	public static void menu(){
		while (true) {
			System.out.println("----------个人生活助手平台----------");
			System.out.println("---欢迎您,用户"+users1.getUserName()+"上次登录时间:"+userdao.selectUsersName(users1.getUserName()).getLogin_time()+"---");
			System.out.println("1.信息维护 2.修改密码 3.个人钱包 4.备忘录 5.娱乐天地 0.返回登录主菜单");
			System.out.println("请选择业务:");
			String input = sc.next();
			switch (input) {
				case "1":
					// 信息维护
					UserInformationUI.updateTelAddress();
					break;
					
				case "2":
					// 修改密码
					UserInformationUI.updatePassword();
					break;
					
				case "3":
					// 个人钱包
					AccountUI.Menu();
					break;
					
				case "4":
					// 备忘录
					MemoUI.MemorandumMenu();
					break;
					
				case "5":
					// 娱乐天地
					RankingUI.rankingMenu();
					break;
					
				case "0":
					// 返回登录主菜单
					return;
	
				default:
					System.out.println("输入有误");
					break;
			}
		}
	}
	
	
}
