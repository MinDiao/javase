/**
 * 
 */
package com.life.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.life.dao.IMemoDao;
import com.life.po.Memo;
import com.life.utils.JdbcUtils;

/** 
 * 	类描述：查看备忘录持久化层实现类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月11日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class MemoDaoImpl implements IMemoDao {

	/* (non-Javadoc)
	 * @see com.life.dao.IMemorandumDao#selectAll(com.life.po.Users)
	 * 根据用户的id查询备忘录
	 */
	@Override
	public List<Memo> selectMemo(Memo memo) {
		// sql
		String sql = "select * from memorandum where userid = ?";
		// 初始化实体类
		List<Memo> list = null;
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句并返回多个实体类
		try {
			list = qr.query(sql, new BeanListHandler<>(Memo.class), memo.getUserId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.life.dao.IMemoDao#insertMemo(com.life.po.Memo)
	 * 添加备忘录
	 */
	@Override
	public int insertMemo(Memo memo) {
		// sql
		String sql = "insert into memorandum(memorandum_title, time, content, userId) values(?,?,?,?)";
		// 初始化影响行数
		int rows = 0;
		// 设置数组来填充占位符
		Object[] params = {memo.getMemorandum_title(), memo.getTime(), memo.getContent(), memo.getUserId()};
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句并返回影响行数
		try {
			rows = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	/* (non-Javadoc)
	 * @see com.life.dao.IMemoDao#selectMemoMid(int)
	 * 根据备忘录的id查看备忘录
	 */
	@Override
	public Memo selectMemoMid(int mid) {
		// sql
		String sql = "select * from memorandum where memorandum_id = ?";
		// 初始化实体类
		Memo memo = null;
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句并返回多个实体类
		try {
			memo = qr.query(sql, new BeanHandler<>(Memo.class), mid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memo;
	}

	/* (non-Javadoc)
	 * @see com.life.dao.IMemoDao#updateMemo(com.life.po.Memo)
	 * 修改备忘录
	 */
	@Override
	public int updateMemo(Memo memo) {
		// sql
		String sql = "update memorandum set memorandum_title = ?, content = ? where memorandum_id = ?";
		// 初始化影响行数
		int rows = 0;
		// 设置数组来填充占位符
		Object[] params = {memo.getMemorandum_title(), memo.getContent(), memo.getMemorandum_id()};
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句并返回影响行数
		try {
			rows = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	/* (non-Javadoc)
	 * @see com.life.dao.IMemoDao#delete(int)
	 * 删除备忘录
	 */
	@Override
	public int delete(int mid) {
		// sql
		String sql = "delete from memorandum where memorandum_id = ?";
		// 初始化影响行数
		int rows = 0;
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句并返回影响行数
		try {
			rows = qr.update(sql, mid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

}
