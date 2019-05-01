/**
 * 
 */
package com.zw.po;

/** 
 * 	类描述：银行实体类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月5日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class Bank {
	
	private int bankId;//银行编号
	private String bankName;//银行姓名
	private String bankTel;//银行电话
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
	 * @return the bankTel
	 */
	public String getBankTel() {
		return bankTel;
	}
	/**
	 * @param bankTel the bankTel to set
	 */
	public void setBankTel(String bankTel) {
		this.bankTel = bankTel;
	}
	/**
	 * 
	 */
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param bankName
	 * @param bankTel
	 */
	public Bank(String bankName, String bankTel) {
		this.bankName = bankName;
		this.bankTel = bankTel;
	}
	/**
	 * @param bankId
	 * @param bankName
	 * @param bankTel
	 */
	public Bank(int bankId, String bankName, String bankTel) {
		this.bankId = bankId;
		this.bankName = bankName;
		this.bankTel = bankTel;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", bankTel=" + bankTel + "]";
	}

}
