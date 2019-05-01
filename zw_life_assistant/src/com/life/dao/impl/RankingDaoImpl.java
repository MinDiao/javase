/**
 * 
 */
package com.life.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.life.dao.IRankingDao;
import com.life.po.Ranking;
import com.life.utils.JdbcUtils;

/** 
 * 	类描述：娱乐天地持久化层实现类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月12日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class RankingDaoImpl implements IRankingDao {

	/* (non-Javadoc)
	 * @see com.life.dao.IRankDao#selectRank()
	 * 查看排行榜
	 */
	@Override
	public List<Ranking> selectRank() {
		// sql
		String sql = "select * from ranking";
		// 初始化集合
		List<Ranking> list = null;
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句并返回影响行数
		try {
			list = qr.query(sql, new BeanListHandler<>(Ranking.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
