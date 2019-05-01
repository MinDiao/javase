/**
 * 
 */
package com.zw.view;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.zw.po.Asset;
import com.zw.po.AssetInfo;
import com.zw.po.Bank;
import com.zw.po.User;
import com.zw.service.IAssetService;
import com.zw.service.IBankService;
import com.zw.service.IUserService;
import com.zw.service.impl.AssetServiceImpl;
import com.zw.service.impl.BankServiceImpl;
import com.zw.service.impl.UserServiceImpl;

/** 
 * 	类描述：用户界面
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月6日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class UserUI {

	//设置输入的静态方法,因为也是静态方法
	private static Scanner sc = new Scanner(System.in);

	//
	private static IUserService userservice = new UserServiceImpl();

	//
	private static IAssetService assetservice = new AssetServiceImpl();

	//银行实现类
	private static IBankService bankservice = new BankServiceImpl();

	//创建一个User实体类对象来接收结果
	private static User user1 = new User();


	public static void userLogin() {

		while (true) {
			System.out.println("---------------个人资产管理系统----------------");
			System.out.println("------------------用户界面-------------------");
			System.out.println("------------------1.登录-------------------");
			System.out.println("------------------2.注册-------------------");
			System.out.println("请选择业务：");
			String result = sc.next();
			switch (result) {
			case "1":
				//登录
				userMenu();
				return;

			case "2":
				//注册
				reg();
				return;

			default:
				//输入错误
				System.out.println("输入错误,请重新输入:");
				break;
			}
		}

	}

	//登录
	public static void userMenu() {
		//初始化输入机会
		int loginCount = 3;
		while (true) {

			System.out.println("---------------个人资产管理系统----------------");
			System.out.println("------------------用户登录-----------------");
			System.out.println("请输入用户名：");
			String name = sc.next();
			System.out.println("请输入密码：");
			String pwd = sc.next();
			User user = new User();
			user.setUserName(name);
			user.setUserPassword(pwd);
			
			/* 用成员变量接收数据库执行后结果 */
			user1 = userservice.userLogin(user);

			//判断是否执行成功
			if (user1 != null) {
				System.out.println("登录成功");
				//操作页面
				menu();
				return;
			} else {
				if (--loginCount > 0) {
					System.out.println("用户名和密码错误,还有"+(loginCount)+"次机会");
				} else {
					System.out.println("连接输入三次有误,请确认后登录!");
					return;//终止循环并返回方法调用处
				}

			}

		}

	}

	//注册
	public static void reg() {

		while (true) {

			System.out.println("---------------个人资产管理系统----------------");
			System.out.println("------------------顾客注册-----------------");
			System.out.println("请输入用户名：");
			String name = sc.next();
			System.out.println("请输入密码：");
			String pwd = sc.next();
			System.out.println("请输入真实姓名：");
			String realName = sc.next();
			System.out.println("请输入性别：");
			String sex = sc.next();
			System.out.println("请输入电话：");
			String tel = sc.next();
			System.out.println("请输入身份证号：");
			String idCard = sc.next();
			System.out.println("请输入住址：");
			String address = sc.next();
			//通过构造方法传递属性并实例化实体类
			User user = new User(name, pwd, realName, sex, tel, idCard, address);
			//执行注册
			int result = userservice.Register(user);
			//判断是否执行成功
			if (result == -1) {
				System.out.println("该用户名已存在");
			} else if(result > 0) {
				System.out.println("注册成功");
				
				//接下来自动登录,将user的值赋给user1,才能user1才能使用geter\seter
				user1 = user;
				user1.setUserId(result);//为userid赋值
				
				menu();
				return;
			} else {
				System.out.println("注册失败");
			}
		}

	}


	//用户菜单
	public static void menu() {

		while (true) {

			System.out.println("--------------------------个人资产管理系统--------------------------");
			System.out.println("---------------------------[欢迎您,用户"+user1.getUserName()+"]-----------------------------");
			System.out.println("1.查看所有资产 \t 2.添加资产 \t 3.存取资产 \t 4.修改密码  \t 5.返回登录主菜单");
			System.out.println("--------------------------个人资产管理系统--------------------------");
			System.out.println("请选择业务:");
			String result = sc.next();
			switch (result) {
			case "1":
				showAssetInfo();
				//查看所有资产
				break;

			case "2":
				//添加资产
				addAsset();
				break;

			case "3":
				//存取资产
				extractAnddepoAsset();
				break;

			case "4":
				//修改密码
				updatePasword();
				break;

			case "5":
				//返回登录主菜单
				System.out.println("谢谢使用");
				user1 = null; //将管理员信息设为空则会退出
				return; //返回上一层

			default:
				//输入有误
				System.out.println("输入有误,请重新输入:");
				break;
			}

		}

	}


	//查看所有资产
	public static void showAssetInfo() {
		System.out.println("---------------查看个人资产----------------");
		//查看个人资产
		List<AssetInfo> list = assetservice.selectAssetInfo(user1.getUserId());
		//判断是否有资产
		if (list == null || list.size() == 0) {
			System.out.println("你真是个穷B");
		} else {
			for (AssetInfo assetInfo : list) {
				System.out.println(assetInfo);
			}
		}

	}

	//添加资产
	public static void addAsset() {

		System.out.println("---------------添加新资产----------------");
		System.out.println("目前存在的银行信息");
		//查看目前所有的银行
		List<Bank> showBank = bankservice.selectBank();
		for (Bank bank : showBank) {
			System.out.println(bank);
		}
		//输入银行id
		System.out.println("请输入银行的id");
		int bankId = sc.nextInt();
		System.out.println("请输入卡号");
		String cardNum = sc.next();
		System.out.println("请输入金额");
		double money = sc.nextDouble();
		//实例化构造方法并给实体类传递属性
		Asset asset = new Asset(bankId, cardNum, money, new Date(), user1.getUserId());
		//初始化结果
		int result = assetservice.addAsset(asset);
		//判断是否存在银行
		if (result == -1) {
			System.out.println("银行不存在");
		} else if(result == -2) {
			System.out.println("该银行已经有该卡号");
		} else if(result > 0) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}

	}

	//存 + 取资产
	public static void extractAnddepoAsset() {

		System.out.println("--------------------------存取资产-------------------------");
		System.out.println("请选择提取或存入资产:1.提取 2.存入");
		System.out.println("--------------------------存取资产-------------------------");
		System.out.println("请选择业务:");
		String result = sc.next();
		switch (result) {
		case "1":
			//提取
			extractAsset();
			return;

		case "2":
			//存入
			depositAsset();
			break;

		default:
			//输入有误
			System.out.println("输入有误");
			break;
		}
	}

	//取钱
	public static void extractAsset() {

		System.out.println("--------------------------取资产-------------------------");
		System.out.println("你目前的资产如下:");
		//查询该用户所有资产
		showAssetInfo();
		//输入银行id
		System.out.println("请输入银行的id");
		int bankId = sc.nextInt();
		System.out.println("请输入卡号");
		String cardNum = sc.next();
		System.out.println("请输入金额");
		double money = sc.nextDouble();
		//先将信息封装到实体类中
		Asset asset = new Asset();
		asset.setBankId(bankId);
		asset.setUserId(user1.getUserId());
		asset.setCardNum(cardNum);
		//调用提取的方法
		int result = assetservice.extractAsset(asset, money);
		//判断
		if (result == -1) {
			System.err.println("没有该资产");
		} else if(result == -2) {
			System.out.println("你资产不足");
		} else if(result > 0) {
			System.out.println("提取成功");
		} else {
			System.out.println("提取失败");
		}

	}

	//存钱
	public static void depositAsset() {

		System.out.println("--------------------------存资产-------------------------");
		System.out.println("你目前的资产如下:");
		//查询该用户所有资产
		showAssetInfo();
		//输入银行id
		System.out.println("请输入银行的id");
		int bankId = sc.nextInt();
		System.out.println("请输入卡号");
		String cardNum = sc.next();
		System.out.println("请输入金额");
		double money = sc.nextDouble();
		//先将信息封装到实体类中
		Asset asset = new Asset();
		asset.setBankId(bankId);
		asset.setUserId(user1.getUserId());
		asset.setCardNum(cardNum);
		//调用提取的方法
		int result = assetservice.depositAsset(asset, money);
		//判断
		if (result == -1) {
			System.err.println("没有该资产");
		} else if(result > 0) {
			System.out.println("存钱成功");
		} else {
			System.out.println("存钱失败");
		}

	}
	
	//查看个人总资产
	public static void sumAssetMoney() {
		
		double money = assetservice.sumAssetMoney(user1.getUserId());
		System.out.println(user1.getRealName() +",你当前的总资产为:"+ money);
		
	}
	
	//修改个人密码
	public static void updatePasword() {
		
		System.out.println("--------------------------修改密码-------------------------");
		//输入新密码
		System.out.println("请输入新密码");
		String newPassword = sc.next();
		int result = userservice.updatePassword(user1, newPassword);
		//判断
		if(result > 0) {
			System.out.println("修改密码成功");
		} else {
			System.out.println("修改密码失败");
		}
		
	}

}
