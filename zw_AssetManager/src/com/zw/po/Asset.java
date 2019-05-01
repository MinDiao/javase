/**
 * 
 */
package com.zw.po;

import java.util.Date;

/** 
 * 	类描述：
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月5日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class Asset {
	
	private int bankId;//银行编号
	private String cardNum;//卡号
	private double cardMoney;//余额
	private Date createDate;//开户时间
	private int userId;//用户编号
	/**
	 * @return the bankId
	 */
	public int getBankId() {
		return bankId;
	}
	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	/**
	 * @return the cardNum
	 */
	public String getCardNum() {
		return cardNum;
	}
	/**
	 * @param cardNum the cardNum to set
	 */
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	/**
	 * @return the cardMoney
	 */
	public double getCardMoney() {
		return cardMoney;
	}
	/**
	 * @param cardMoney the cardMoney to set
	 */
	public void setCardMoney(double cardMoney) {
		this.cardMoney = cardMoney;
	}
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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
	public Asset() {
	}
	/**
	 * @param bankId
	 * @param cardNum
	 * @param cardMoney
	 * @param createDate
	 * @param userId
	 */
	public Asset(int bankId, String cardNum, double cardMoney, Date createDate, int userId) {
		this.bankId = bankId;
		this.cardNum = cardNum;
		this.cardMoney = cardMoney;
		this.createDate = createDate;
		this.userId = userId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Asset [bankId=" + bankId + ", cardNum=" + cardNum + ", cardMoney=" + cardMoney + ", createDate="
				+ createDate + ", userId=" + userId + "]";
	}

}
