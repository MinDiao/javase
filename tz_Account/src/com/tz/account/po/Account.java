/**
 * 
 */
package com.tz.account.po;
/** 
 * 	类描述：实体类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月3日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class Account {
	private int id;
	private String name;
	private double money;
	private String accounting;
	private String createtime;
	private String description;
	/**
	 * @param id
	 * @param name
	 * @param money
	 * @param accounting
	 * @param createtime
	 * @param description
	 */
	public Account(int id, String name, double money, String accounting, String createtime, String description) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
		this.accounting = accounting;
		this.createtime = createtime;
		this.description = description;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the accounting
	 */
	public String getAccounting() {
		return accounting;
	}
	/**
	 * @param accounting the accounting to set
	 */
	public void setAccounting(String accounting) {
		this.accounting = accounting;
	}
	/**
	 * @return the createtime
	 */
	public String getCreatetime() {
		return createtime;
	}
	/**
	 * @param createtime the createtime to set
	 */
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", money=" + money + ", accounting=" + accounting
				+ ", createtime=" + createtime + ", description=" + description + "]";
	}
	
}
