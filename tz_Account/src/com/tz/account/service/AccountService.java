/**
 * 
 */
package com.tz.account.service;

import com.tz.account.dao.AccountDao;
import com.tz.account.po.Account;

/** 
 * 	类描述：服务层
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月3日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class AccountService {
	
	private AccountDao dao = new AccountDao();

	//add
	public void addAcount(Account account) {
		dao.addAccount(account);
	}
	
	//selectAll
	public void selectAll() {
		
	}
	
	
	
}
