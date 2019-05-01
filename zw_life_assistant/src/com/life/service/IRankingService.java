/**
 * 
 */
package com.life.service;

import java.util.List;

import com.life.po.Ranking;

/** 
 * 	类描述：
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月12日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public interface IRankingService {
	
	/**
	 * 
	 * 	方法描述：查看游戏排行版
	 * 	@return 游戏排行榜实体类
	 */
	public List<Ranking> selectRank();
	
}
