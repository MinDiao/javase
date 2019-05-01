/**
 * 
 */
package com.life.service.impl;

import java.util.List;

import com.life.dao.IRankingDao;
import com.life.dao.impl.RankingDaoImpl;
import com.life.po.Ranking;
import com.life.service.IRankingService;

/** 
 * 	类描述：
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月12日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class RankingServiceImpl implements IRankingService {
	
	private static IRankingDao rankdao = new RankingDaoImpl();

	/* (non-Javadoc)
	 * @see com.life.service.IRankingService#selectRank()
	 * 查看游戏排行版
	 */
	@Override
	public List<Ranking> selectRank() {
		
		return rankdao.selectRank();
	}

}
