/**
 * 
 */
package com.life.po;

import java.util.Date;

/** 
 * 	类描述：日志实体类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月11日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class AccountLog {
	
	private int log_id; // 日志编号
	private int accountId; // 转出账户
	private int transfer_account; // 转入账户
	private String type; // 类型
	private Date log_time; // 操作时间
	private double money; // 操作金额
	/**
	 * @return the log_id
	 */
	public int getLog_id() {
		return log_id;
	}
	/**
	 * @param log_id the log_id to set
	 */
	public void setLog_id(int log_id) {
		this.log_id = log_id;
	}
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
	 * @return the transfer_account
	 */
	public int getTransfer_account() {
		return transfer_account;
	}
	/**
	 * @param transfer_account the transfer_account to set
	 */
	public void setTransfer_account(int transfer_account) {
		this.transfer_account = transfer_account;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the log_time
	 */
	public Date getLog_time() {
		return log_time;
	}
	/**
	 * @param log_time the log_time to set
	 */
	public void setLog_time(Date log_time) {
		this.log_time = log_time;
	}
	/**
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}
	/**
	 * @param money the money to set
	 */
	public void setMoney(double money) {
		this.money = money;
	}
	/**
	 * 
	 */
	public AccountLog() {
		
	}
	
	/**
	 * @param accountId
	 * @param type
	 */
	public AccountLog(int accountId, String type) {
		this.accountId = accountId;
		this.type = type;
	}
	/**
	 * @param accountId
	 * @param transfer_account
	 * @param type
	 * @param log_time
	 * @param money
	 */
	public AccountLog(int accountId, int transfer_account, String type, Date log_time, double money) {
		this.accountId = accountId;
		this.transfer_account = transfer_account;
		this.type = type;
		this.log_time = log_time;
		this.money = money;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account_log [log_id=" + log_id + ", accountId=" + accountId + ", transfer_account=" + transfer_account
				+ ", type=" + type + ", log_time=" + log_time + ", money=" + money + "]";
	}

}
