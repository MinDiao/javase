/**
 * 
 */
package com.tz.account.view;

import java.util.List;
import java.util.Scanner;

import com.tz.account.controller.AccountController;
import com.tz.account.po.Account;

/** 
 * 	类描述：表示层
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月3日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class View_DOTO {
	
	private AccountController controller = new AccountController();

	public void test() {
		
		System.out.println("----------Welcom !----------");
		System.out.println("1.添加账务\t2.删除账务\t3.修改账务\t4.查询账务\t5.退出");
		System.out.println("请输入要操作的功能序号(1-5):");

		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();

		while (true) {
			switch (choose) {
			case 1:
				//添加账务
				addAccount();
				break;
			case 2:
				//删除账务
				deleteAccount();
				break;
			case 3:
				//修改账务
				updateAccount();
				break;
			case 4:
				//查询账务
				selectAccount();
				break;
			case 5:
				//退出
				System.exit(0);
				break;
			default:
				//输入有误
				break;
			}
		}
		
	}
	
	//增
	public void addAccount() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("----------添加账务 !----------");
		System.out.println("请输入花费途径:");
		String name = sc.next();
		System.out.println("请输入花费钱数:");
		double money = sc.nextDouble();
		System.out.println("请输入支付方式:");
		String accounting = sc.next();
		System.out.println("请输入消费日期:(格式:YYYY-MM-DD):");
		String createtime = sc.next();
		System.out.println("请输入消费备注:");
		String description = sc.next();
		
		//接受数据,通过构造方法赋值给po类对象
		Account account = new Account(0,name,money,accounting,createtime,description);
		controller.addAccount(account);
		
	}
	
	//删出指定
	public void deleteAccount() {
		//调出所有数据让用户选择
		selectAll();
		
		//调出所有数据让用户选择
		System.out.println("请输入您要删除的账务编号");
		int id = new Scanner(System.in).nextInt();
		//调用控制层,传递id
		controller.deleteAccount(id);
		System.out.println("删除成功!");
		
	}
	
	//改
	public void updateAccount() {
		
		//调出所有数据让用户选择编辑
		selectAll();
		System.out.println("现在进入编辑功能,请输入数据:");
		Scanner sc = new Scanner(System.in);
		System.out.println("编辑账务,请输入您要编辑的编号:");
		int id = sc.nextInt();
		
		System.out.println("请输入花费途径:");
		String name = sc.next();
		System.out.println("请输入花费钱数:");
		double money = sc.nextDouble();
		System.out.println("请输入支付方式:");
		String accounting = sc.next();
		System.out.println("请输入消费日期:(格式:YYYY-MM-DD):");
		String createtime = sc.next();
		System.out.println("请输入消费备注:");
		String description = sc.next();
		//实例化
		Account account = new Account(0,name,money,accounting,createtime,description);
		//controller调用
		controller.updateAccount(account);
		System.out.println("编辑成功");
		
	}
	
	//查功能
	public void selectAccount() {
		
		System.out.println("请选择查询方式:1.查询所有数据\t2.指定日期查询");
		int choose = new Scanner(System.in).nextInt();
		switch (choose) {
		case 1:
			selectAll();
			break;
		case 2:
			select();
			break;
		}
	}
		
	//查询所有
	public void selectAll() {
		//泛型接收
		List<Account> list = controller.selectAll();
		
		//判断List集合是否接收到
		if (list.size() != 0) {
			print(list);
		} else {
			System.out.println("抱歉,没有找到数据");
		}
	}
	
	//指定日期查询
	public void select() {
		System.out.println("选择日期查询,请输入开始日期:(YYYY-MM-DD)");
		Scanner sc = new Scanner(System.in);
		String startDate = sc.next();
		System.out.println("请输入结束日期:(YYYY-MM-DD)");
		String endDate = sc.next();
		
		List<Account> list = controller.select(startDate, endDate);
		//判断List集合是否接收到
		if (list.size() != 0) {
			print(list);
		} else {
			System.out.println("抱歉,没有找到数据");
		}
	}
	
	//遍历打印
	public void print(List<Account> list) {
		//输出目录
		System.out.println("编号\t\t消费类别\t\t消费金额:\t\t消费时间\t\t备注");
		//遍历输出list
		for (Account account : list) {
			System.out.println(account.getId()+"\t\t"+account.getName()
			+"\t\t"+account.getMoney()+"\t\t"+account.getAccounting()
			+"\t\t"+account.getCreatetime()+"\t\t"+account.getDescription());
		}
	}

}
