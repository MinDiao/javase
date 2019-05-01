/**
 * 
 */
package com.zw.po;

import java.util.Date;

/** 
 * 	类描述：资产扩展类 针对多表查询,查询结果有几列,该类下定义几个属性,为了方便以后的项目扩展
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月6日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class AssetInfo {
	
	private int userId;//用户编号
	private String userName;//用户名
	private int bankId;//银行卡号
	private String bankName;//银行名
	private String cardNum;//卡号
	private double cardMoney;//余额
	private Date createDate;//开户时间
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
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
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
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
	 * 
	 */
	public AssetInfo() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param userId
	 * @param userName
	 * @param bankId
	 * @param bankName
	 * @param cardNum
	 * @param cardMoney
	 * @param createDate
	 */
	public AssetInfo(int userId, String userName, int bankId, String bankName, String cardNum, double cardMoney,
			Date createDate) {
		this.userId = userId;
		this.userName = userName;
		this.bankId = bankId;
		this.bankName = bankName;
		this.cardNum = cardNum;
		this.cardMoney = cardMoney;
		this.createDate = createDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AssetInfo [userId=" + userId + ", userName=" + userName + ", bankId=" + bankId + ", bankName="
				+ bankName + ", cardNum=" + cardNum + ", cardMoney=" + cardMoney + ", createDate=" + createDate + "]";
	}

}
