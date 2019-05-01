/**
 * 
 */
package com.life.view;

import java.util.Date;
import java.util.Scanner;

import com.life.po.Account;
import com.life.po.AccountLog;
import com.life.service.IAccountService;
import com.life.service.impl.AccountServiceImpl;

/** 
 * 	类描述：资产表示层
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月11日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class AccountUI {
	
	// 键盘输入
	private static Scanner sc = new Scanner(System.in);
	// 实现资产服务层
	private static IAccountService accountservice = new AccountServiceImpl();
	// 初始化实体类创建实体类的成员变量,用户接收方法执行的参数-资产类中:定死是用id登录
	private static Account account1 = new Account(UsersUI.users1.getUserId());

	/** 
	 * 	方法描述：个人钱包模块
	 */
	public static void Menu() {
		
		while (true) {
			System.out.println("----------个人钱包----------");
			System.out.println("1.查看余额 2.存钱 3.转账 4.统计查询 0.返回主菜单");
			System.out.println("请选择业务:");
			String input = sc.next();
			switch (input) {
				case "1":
					// 查看余额
					selectUserIdAccount();
					break;
					
				case "2":
					// 存钱
					saveMoney();
					break;
					
				case "3":
					// 转账
					transferAccounts();
					break;
					
				case "4":
					// 统计查询
					statistics();
					break;
					
				case "0":
					// 返回主菜单
					return;
	
				default:
					System.out.println("输入有误");
					break;
			}
		}
		
	}
	
	// 查看余额
	public static void selectUserIdAccount(){
		System.out.println("----------个人钱包----------");
		System.out.println("----------查看余额----------");
		// 实例化资产实体类
		Account account = new Account();
		// 将查询出的临时资产实体类赋值到真实资产实体类中
		account = accountservice.selectUserIdAccount(account1);
		// 判断是否查询有值
		if (account != null) {
			System.out.print("您的账户:"+account.getAccountId()+"余额为:"+account.getAccount_money());
			return;
			
		} else {
			System.out.println("查看余额失败");
			return;
		}
		
	}
	
	// 存钱 + 添加到日志
	public static void saveMoney(){
		System.out.println("----------个人钱包----------");
		System.out.println("----------存钱----------");
		System.out.println("请输入存款金额:");
		// 初始化金额
		double money = 0.0;
		// 输入金额
		money = sc.nextDouble();
		// 实例化资产实体类类,并将金额和用户id传递到实体类
		Account account = new Account();
		// 将查询出的临时资产实体类accountId赋值到真实资产实体类中
		Account account2 = accountservice.selectUserIdAccount(account1);
		// 为实体类赋值
		account.setAccount_money(money);
		account.setAccountId(account2.getAccountId());
		
		// 获取资产账户id(accountId)并设置到临时实体类中
		account1.setAccountId(accountservice.selectUserIdAccount(account1).getAccountId());
		// 将存钱添加到日志
		AccountLog accountlog = new AccountLog(account1.getAccountId(), account1.getAccountId(), "转入", new Date(), money);
		// 执行并返回boolean值
		boolean result = accountservice.saveMoney(account, accountlog);
		// 判断是否执行成功
		if (result) {
			System.out.println("您的账户成功存入"+money+"元");
		} else {
			System.out.println("存钱失败");
		}
		
		return;
	}
	
	// 转账 + 添加到日志
	public static void transferAccounts(){
		System.out.println("----------个人钱包----------");
		System.out.println("----------转账----------");
		// 实例化资产实体类
		Account account = new Account();
		// 将查询出的临时资产实体类赋值到真实资产实体类中
		account = accountservice.selectUserIdAccount(account1);
		// 输出当前用户资产信息
		System.out.println(account);
		// 输入对方账户
		System.out.println("请输入对方账户:");
		int id = sc.nextInt();
		// 实例化对方资产实体类
		Account account2 = new Account();
		account2.setAccountId(id);
		// 输入金额\
		System.out.println("请输入转账金额:");
		double money = sc.nextDouble();
		// 为对方资产实体类赋值转账金额属性
		account.setAccount_money(money);
		// 为对方资产实体类赋值转账金额属性
		account2.setAccount_money(money);
		// 实例化日志实体类
		AccountLog accountlog = new AccountLog(account.getAccountId(), account2.getAccountId(), "转出", new Date(), money);
		// 执行转账
		int result = accountservice.transferAccounts(account, account2, accountlog);
		if (result == -1) {
			System.out.println("账户余额不足");
		} else if (result == -2) {
			System.out.println("对方账户不存在");
		} else if (result >= 3){
			System.out.println("转账成功");
		} else {
			System.out.println("转账失败");
		}
	}
	
	// 统计查询
	public static void statistics(){
		// 实例化资产实体类
		Account account = new Account();
		// 将查询出的临时资产实体类赋值到真实资产实体类中
		account = accountservice.selectUserIdAccount(account1);
		// 查询当月转入
		AccountLog accountlogIn = new AccountLog(account.getAccountId(), "转入");
		// 查询当月转出
		AccountLog accountlogOut = new AccountLog(account.getAccountId(), "转出");
		// 执行并输出结果
		System.out.println("当月收入统计"+ accountservice.statistics(accountlogIn));
		System.out.println("当月支出统计"+ accountservice.statistics(accountlogOut));
	}
	
}












