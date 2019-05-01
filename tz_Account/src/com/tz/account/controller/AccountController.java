/**
 * 
 */
package com.tz.account.controller;

import com.tz.account.po.Account;
import com.tz.account.service.AccountService;

/** 
 * 	类描述：控制层
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月3日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class AccountController {
	
	private AccountService service = new AccountService();

	//add
	public void addAccount(Account account) {
		service.addAcount(account);
	}
	
}
