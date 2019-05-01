/**
 * 
 */
package com.life.po;

import java.util.Date;

/** 
 * 	类描述：备忘录实体类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月11日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class Memo {
	
	private int memorandum_id;
	private String memorandum_title;
	private Date time;
	private String content;
	private int userId;
	/**
	 * @return the memorandum_id
	 */
	public int getMemorandum_id() {
		return memorandum_id;
	}
	/**
	 * @param memorandum_id the memorandum_id to set
	 */
	public void setMemorandum_id(int memorandum_id) {
		this.memorandum_id = memorandum_id;
	}
	/**
	 * @return the memorandum_title
	 */
	public String getMemorandum_title() {
		return memorandum_title;
	}
	/**
	 * @param memorandum_title the memorandum_title to set
	 */
	public void setMemorandum_title(String memorandum_title) {
		this.memorandum_title = memorandum_title;
	}
	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
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
	public Memo() {
		
	}
	
	/**
	 * @param memorandum_id
	 * @param memorandum_title
	 * @param content
	 */
	public Memo(int memorandum_id, String memorandum_title, String content) {
		this.memorandum_id = memorandum_id;
		this.memorandum_title = memorandum_title;
		this.content = content;
	}
	/**
	 * @param memorandum_title
	 * @param time
	 * @param content
	 * @param userId
	 */
	public Memo(String memorandum_title, Date time, String content, int userId) {
		this.memorandum_title = memorandum_title;
		this.time = time;
		this.content = content;
		this.userId = userId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Memo [memorandum_id=" + memorandum_id + ", memorandum_title=" + memorandum_title + ", time=" + time
				+ ", content=" + content + ", userId=" + userId + "]";
	}

}
