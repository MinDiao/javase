/**
 * 
 */
package com.life.service;

import java.math.BigDecimal;

import com.life.po.Account;
import com.life.po.AccountLog;

/** 
 * 	类描述：资产服务层
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月11日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public interface IAccountService {
	
	/**
	 * 
	 * 	方法描述：查看余额\查看该行信息
	 * 	@param account 资产实体类
	 * 	@return 资产实体类
	 */
	public Account selectUserIdAccount (Account account);
	
	/**
	 * 
	 * 	方法描述：存钱 + 添加到日志
	 * 	@param account 资产实体类
	 * 	@param accountlog 日志实体类
	 * 	@return 执行是否成功
	 */
	public boolean saveMoney(Account account, AccountLog accountlog);
	
	/**
	 * 
	 * 	方法描述：转账
	 * 	@param accountA 本账户实体类
	 * 	@param accountB 对方账户实体类
	 * 	@param money 转账的金额
	 * 	@return 影响行数
	 */
	public int transferAccounts(Account accountA, Account accountB, AccountLog accountlog);
	
	/**
	 * 
	 * 	方法描述：查询当月收入\支出的总金额
	 * 	@param accountlog 日志实体类
	 * 	@return 月收入\支出的总金额
	 */
	public BigDecimal statistics(AccountLog accountlog);
}
