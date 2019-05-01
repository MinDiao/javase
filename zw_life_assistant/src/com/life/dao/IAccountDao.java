/**
 * 
 */
package com.life.dao;

import java.math.BigDecimal;

import com.life.po.Account;
import com.life.po.AccountLog;

/** 
 * 	类描述：资产持久化层
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月11日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public interface IAccountDao {
	
	/**
	 * 
	 * 	方法描述：查看余额\查看该行信息
	 * 	@param account 资产实体类
	 * 	@return 资产实体类
	 */
	public Account selectUserIdAccount(Account account);
	
	/**
	 * 
	 * 	方法描述：存钱
	 * 	@param accout 资产实体类
	 * 	@return 影响行数
	 */
	public int saveMoney(Account account);
	
	/**
	 * 
	 * 	方法描述：添加日志
	 * 	@param accoutlog 日志实体类
	 * 	@return 影响行数
	 */
	public int accountLog(AccountLog accountlog);
	
	/**
	 * 
	 * 	方法描述：取钱
	 * 	@param account 资产实体类
	 * 	@return 影响行数
	 */
	public int transferAccounts(Account account);
	
	/**
	 * 
	 * 	方法描述：按账户id查询账户
	 * 	@param accountId 账户id
	 * 	@return 实体类
	 */
	public Account selectAccountId(Account accountId);
	
	/**
	 * 
	 * 	方法描述：当月收入支出统计
	 * 	@param accountId 账户id
	 * 	@return 当月收入支出统计
	 */
	public BigDecimal statistics(AccountLog accountlog);
	
}
