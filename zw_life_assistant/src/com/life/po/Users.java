/**
 * 
 */
package com.life.po;

import java.util.Date;

/** 
 * 	类描述：用户信息实体类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月10日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class Users {
	
	private int userId; // 用户ID
	private String userName; // 用户名
	private String userPassword; // 用户密码
	private String realName; // 用户真实姓名
	private String tel; // 用户电话
	private String address; // 用户地址
	private Date login_time; // 上次登录时间
	
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
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}
	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the login_time
	 */
	public Date getLogin_time() {
		return login_time;
	}
	/**
	 * @param login_time the login_time to set
	 */
	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}
	
	/**
	 * 
	 */
	public Users() {
		
	}
	/**
	 * @param userName
	 * @param userPassword
	 * @param realName
	 * @param tel
	 * @param address
	 */
	public Users(String userName, String userPassword, String realName, String tel, String address, Date login_time) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.realName = realName;
		this.tel = tel;
		this.address = address;
		this.login_time = login_time;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", realName="
				+ realName + ", tel=" + tel + ", address=" + address + "]";
	}
	
}
