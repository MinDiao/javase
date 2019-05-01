/**
 * 
 */
package com.zw.view;

import java.util.List;
import java.util.Scanner;

import com.zw.po.Admin;
import com.zw.po.Bank;
import com.zw.po.User;
import com.zw.service.IAdminService;
import com.zw.service.IBankService;
import com.zw.service.IUserService;
import com.zw.service.impl.AdminServiceImpl;
import com.zw.service.impl.BankServiceImpl;
import com.zw.service.impl.UserServiceImpl;

/** 
 * 	类描述：管理员界面
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月5日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class AdminUI {

	/** 
	 * 	方法描述:管理员登录
	 * 	@param args
	 */
	private static Scanner sc = new Scanner(System.in);
	//创建IAdminService对象
	private static IAdminService adminservice = new AdminServiceImpl();
	//创建IBankService对象
	private static IBankService bankservice = new BankServiceImpl();
	// 创建IUserService对象
	private static IUserService userservice = new UserServiceImpl();
	
	//记录管理员信息
	private static Admin admin = null;
	
	public static void login() {
		
		//记录登录次数,如果三次错误,退出
		int loginCount = 0;
		
		while (true) {
			
			System.out.println("---------------个人资产管理系统----------------");
			System.out.println("------------------管理员登录-----------------");
			System.out.println("请输入用户名：");
			String name = sc.next();
			System.out.println("请输入密码：");
			String pwd = sc.next();
			//将用户名和密码传入实体类中
			Admin ad = new Admin(name, pwd);
			//调用service方法
			admin = adminservice.login(ad);
			//如果admin不为空,则从数据库中已经查出结果
			if (admin != null) {
				System.out.println("登录成功!");
				//管理员操作界面
				menu();
				return;
			} else { //三次机会
				if (++loginCount < 3) {
					System.out.println("您输入有误,请重新输入");
				} else {
					System.out.println("连接输入三次有误,请确认后登录!");
					return;//终止循环并返回方法调用处
					//不使用break因为会直接终止方法
				}
			}
			
		}
	}
	
	//管理员菜单
	public static void menu() {
		
		while (true) {

			System.out.println("--------------------------个人资产管理系统--------------------------");
			System.out.println("---------------------------[欢迎您,管理员"+admin.getAdminName()+"]-----------------------------");
			System.out.println("1.查看所有用户 \t 2.添加银行 \t 3.修改银行 \t 4.删除银行 \t 5.查询所有银行 \t 6.返回登录主菜单");
			System.out.println("--------------------------个人资产管理系统--------------------------");
			System.out.println("请选择业务:");
			String result = sc.next();
			switch (result) {
			case "1":
				//查看所有用户
				selectAllUser();
				break;
				
			case "2":
				//添加银行
				addBank();
				break;
				
			case "3":
				//修改银行
				updateBank();
				break;
				
			case "4":
				//删除银行
				deleteBank();
				break;
				
			case "5":
				//查询所有银行
				selectBank();
				break;
				
			case "6":
				//返回登录主菜单
				System.out.println("谢谢使用");
				admin = null; //将管理员信息设为空则会退出
				return; //返回上一层
			
			default:
				//输入有误
				System.out.println("输入有误,请重新输入:");
				break;
			}
			
		}
		
	}
	//查看所有的用户
	public static void selectAllUser() {
		List<User> list = userservice.selectAllUser();
		for (User user : list) {
			System.out.println(user);
		}
	}
	
	//添加银行
	public static void addBank() {
		
		System.out.println("---------------个人资产管理系统----------------");
		System.out.println("请输入银行名:");
		String bankName = sc.next();
		System.out.println("请输入银行电话:");
		String bankTel = sc.next();
		//把信息封装到Bank实体类中
		Bank bank = new Bank(bankName, bankTel);
		//调用添加方法
		int result = bankservice.addBank(bank);
		//判断是否添加成功
		if (result > 0) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
		
	}
	
	//查询所有银行
	public static void selectBank() {
		
		System.out.println("---------------查询所有银行----------------");
		List<Bank> list = bankservice.selectBank();
		if (list != null || list.size() > 0) {
			for (Bank bank : list) {
				System.out.println(bank);
			}
		} else {
			System.out.println("无此银行信息");
		}
		
	}
	
	//修改银行
	public static void updateBank() {
		
		System.out.println("---------------个人资产管理系统----------------");
		System.out.println("请输入要修改的银行编号");
		int bankId = sc.nextInt();
		System.out.println("请输入银行名:");
		String bankName = sc.next();
		System.out.println("请输入银行电话:");
		String bankTel = sc.next();
		//把信息封装到Bank实体类中
		Bank bank = new Bank(bankId, bankName, bankTel);
		//调用修改方法,返回影响行数
		int result = bankservice.updateBank(bank);
		//判断是否添加成功
		if (result == -1) {
			System.out.println("银行不存在");
		} else if(result == -2) {
			System.out.println("银行已存在");
		} else if(result > 0) {
			System.out.println("修改成功");
		} else {
			//result返回0
			System.out.println("修改失败");
		}
		
	}
	
	//删除银行
	public static void deleteBank() {
		
		System.out.println("---------------个人资产管理系统----------------");
		System.out.println("请输入要删除的银行编号");
		int bankId = sc.nextInt();
		//调用删除银行方法，返回影响行数
		boolean result = bankservice.deleteBank(bankId);
		//判断
		if (result) {
			System.out.println("删除银行成功");
		} else {
			System.out.println("删除银行失败");
		}
	}

}
