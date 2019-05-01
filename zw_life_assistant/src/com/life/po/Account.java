/**
 * 
 */
package com.life.po;

/** 
 * 	类描述：用户资产实体类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月10日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class Account {
	
	private int accountId; // 账户编号
	private double account_money; // 账户总金额
	private int userId; // 用户编号
	
	/**
	 * @return the accountId
	 */
	public int getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	/**
	 * @return the account_money
	 */
	public double getAccount_money() {
		return account_money;
	}
	/**
	 * @param account_money the account_money to set
	 */
	public void setAccount_money(double account_money) {
		this.account_money = account_money;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * 
	 */
	public Account() {
		
	}
	/**
	 * @param userId
	 */
	public Account(int userId) {
		this.userId = userId;
	}
	
	/**
	 * @param account_money
	 * @param userId
	 */
	public Account(double account_money, int userId) {
		this.account_money = account_money;
		this.userId = userId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", decimal=" + account_money + ", userId=" + userId + "]";
	}

}
