/**
 * 
 */
package com.life.po;

import java.util.Date;

/** 
 * 	类描述：游戏排行榜实体类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月12日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class Ranking {
	
	private int rankingId; // 积分排行ID
	private int userId; // 用户ID
	private int integral; // 积分
	private Date time; // 耗时
	/**
	 * @return the rankingId
	 */
	public int getRankingId() {
		return rankingId;
	}
	/**
	 * @param rankingId the rankingId to set
	 */
	public void setRankingId(int rankingId) {
		this.rankingId = rankingId;
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
	 * @return the integral
	 */
	public int getIntegral() {
		return integral;
	}
	/**
	 * @param integral the integral to set
	 */
	public void setIntegral(int integral) {
		this.integral = integral;
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
	 * 
	 */
	public Ranking() {
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ranking [rankingId=" + rankingId + ", userId=" + userId + ", integral=" + integral + ", time=" + time
				+ "]";
	}
}
