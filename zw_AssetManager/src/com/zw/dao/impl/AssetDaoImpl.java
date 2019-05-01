/**
 * 
 */
package com.zw.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.zw.dao.IAssetDao;
import com.zw.po.Asset;
import com.zw.po.AssetInfo;
import com.zw.util.JdbcUtils;

/** 
 * 	类描述：
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月5日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class AssetDaoImpl implements IAssetDao {

	/* (non-Javadoc)
	 * @see com.zw.dao.IAssetDao#deleteAsset(int)
	 * 根据银行编号删除个人用户资产
	 */
	@Override
	public int deleteAsset(int bankId) {

		//sql
		String sql = "delete from asset where bankid = ?";
		//初始化受影响行数
		int rows = 0;
		//创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//执行sql语句,并返回受影响行数
		try {
			rows = qr.update(JdbcUtils.getConnection(), sql, bankId);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rows;
		
	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IAssetDao#selectAssetInfo(int)
	 * 根据用户id查询用户资产信息
	 */
	@Override
	public List<AssetInfo> selectAssetInfo(int userId) {
		
		//sql
		String sql = "SELECT `user`.userid, username, bank.bankid, bankname, cardnum, cardmoney, createdate FROM `USER` INNER JOIN asset ON `user`.userid = asset.userid "
				+ "INNER JOIN bank ON bank.bankid = asset.bankid WHERE `user`.userid = ?";
		//初始化List集合
		List<AssetInfo> list = null;
		//
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//
		try {
			list = qr.query(sql, new BeanListHandler<>(AssetInfo.class), 1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IAssetDao#addAsset(com.zw.po.Asset)
	 * 根据实体类添加资产
	 */
	@Override
	public int addAsset(Asset asset) {
		
		//sql
		String sql = "INSERT INTO asset(bankid, cardnum, cardmoney, createdate, userid) VALUES(?, ?, ?, ?, ?)";
		//初始化影响的行数
		int rows = 0;
		//创建连接池核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//创建数组填充占位符
		Object[] params = {asset.getBankId(), asset.getCardNum(), asset.getCardMoney(), asset.getCreateDate(), asset.getUserId()};
		//执行sql语句并返回执行的行数
		try {
			rows = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
		
	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IAssetDao#selectAssetBankIDAndCardNum(com.zw.po.Asset)
	 * 根据银行id + 卡号查询资产
	 */
	@Override
	public Asset selectAssetBankIDAndCardNum(Asset asset) {
		
		//sql
		String sql = "select * from asset where bankid = ? and cardnum = ?";
		//初始化实体类对象
		Asset asset1 = null;
		//获取传过来的实体类的资产的银行id与银行卡号
		Object[] params = {asset.getBankId(), asset.getCardNum()};
		//创建连接池核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//执行sql语句并返回执行的行数
		try {
			asset1 = qr.query(sql, new BeanHandler<>(Asset.class), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return asset1;
		
	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IAssetDao#selectCardMoney(com.zw.po.Asset)
	 */
	/*@Override
	public double selectCardMoney(Asset asset) {
		//sql
		String sql = "select cardmoney from asset where userid = ? and bankid = ? and ";
		//初始化金额
		double money = 0;
		//设置参数数组来填充占位符
		Object[] params = {asset.getUserId(), asset.getBankId()};
		//创建数据源实体类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//执行并返回查询结果
		try {
			money = qr.query(sql, new ScalarHandler<Double>(), params);//因为是一列的值,所以SH不需要指定列
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return money;
	}*/

	/* (non-Javadoc)
	 * @see com.zw.dao.IAssetDao#selectBankidAndUserIdAndCardNum(com.zw.po.Asset)
	 * 查询自己账户的余额
	 */
	@Override
	public Asset selectBankidAndUserIdAndCardNum(Asset asset) {
		
		//sql
		String sql = "select * from asset where bankid = ? and userid = ? and cardnum = ?";
		//初始化资产实体类
		Asset asset1 = null;
		//设置参数数组来填充占位符
		Object[] params = {asset.getBankId(), asset.getUserId(), asset.getCardNum()};
		//创建数据源实体类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//执行并返回查询结果
		try {
			asset1 = qr.query(sql, new BeanHandler<>(Asset.class), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return asset1;

	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IAssetDao#extractAsset(com.zw.po.Asset, double)
	 * 取钱,取钱条件,取钱金额
	 */
	@Override
	public int extractAsset(Asset asset, double extractMoney) {
		
		//sql
		String sql = "update asset set cardmoney = cardmoney - ? where bankid = ? and userid = ? and cardnum = ?";
		//初始化影响行数
		int rows = 0;
		//设置数组参数来填充占位符
		Object[] params = {extractMoney, asset.getBankId(), asset.getUserId(), asset.getCardNum()};
		//创建数据源实体类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//执行并返回执行结果
		try {
			rows = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
		
	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IAssetDao#depositAsset(com.zw.po.Asset, double)
	 * 	存钱
	 */
	@Override
	public int depositAsset(Asset asset, double depositMoney) {
		
		//sql
		String sql = "update asset set cardmoney = cardmoney + ? where bankid = ? and userid = ? and cardnum = ?";
		//初始化影响行数
		int rows = 0;
		//设置数组参数填充占位符
		Object[] params = {depositMoney, asset.getBankId(), asset.getUserId(), asset.getCardNum()};
		//创建数据源实体类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//执行并返回执行结果
		try {
			rows = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
		
	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IAssetDao#sumAssetMoney(int)
	 * 	查看个人总资产
	 */
	@Override
	public double sumAssetMoney(int userId) {
		
		//sql
		String sql = "select sum(cardmoney) from asset where userid = ?";
		//初始化金额
		double money = 0;
		//创建数据源实体类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//执行并返回个人总金额
		try {
			money = qr.query(sql, new ScalarHandler<Double>(), userId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return money;
	}

}
