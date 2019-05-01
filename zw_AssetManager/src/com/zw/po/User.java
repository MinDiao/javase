/**
 * 
 */
package com.zw.po;

/** 
 * 	类描述: 用户实体类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月6日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class User {
	
	private int userId;//用户编号
	private String userName;//用户姓名
	private String userPassword;//用户密码
	private String realName;//真实姓名
	private String sex;//用户性别
	private String tel;//用户电话
	private String idCard;//身份证号
	private String address;//地址
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
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
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
	 * @return the idCard
	 */
	public String getIdCard() {
		return idCard;
	}
	/**
	 * @param idCard the idCard to set
	 */
	public void setIdCard(String idCard) {
		this.idCard = idCard;
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
	 * 
	 */
	public User() {
		
	}
	
	/**
	 * @param userName
	 * @param userPassword
	 * @param realName
	 * @param sex
	 * @param tel
	 * @param idCard
	 * @param address
	 */
	public User(String userName, String userPassword, String realName, String sex, String tel, String idCard,
			String address) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.realName = realName;
		this.sex = sex;
		this.tel = tel;
		this.idCard = idCard;
		this.address = address;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", realName="
				+ realName + ", sex=" + sex + ", tel=" + tel + ", idCard=" + idCard + ", address=" + address + "]";
	}
	
	
}
