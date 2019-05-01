/**
 * 
 */
package com.life.dao.impl;

import java.math.BigDecimal;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.life.dao.IAccountDao;
import com.life.po.Account;
import com.life.po.AccountLog;
import com.life.utils.JdbcUtils;

/** 
 * 	类描述：
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月11日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class AccountDaoImpl implements IAccountDao {

	/* (non-Javadoc)
	 * @see com.life.dao.IAccountDao#selectAccount(com.life.po.Account)
	 * 查看余额
	 */
	@Override
	public Account selectUserIdAccount(Account account) {
		// sql
		String sql = "select * from account where userid = ?";
		// 初始化实体类
		Account account1 = null;
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句并返回实体类
		try {
			account1 = qr.query(sql, new BeanHandler<>(Account.class), account.getUserId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return account1;
	}

	/* (non-Javadoc)
	 * @see com.life.dao.IAccountDao#saveMoney(double)
	 * 存钱
	 */
	@Override
	public int saveMoney(Account account) {
		// sql
		String sql = "update account set account_money = account_money + ? where accountId = ?";
		// 初始化影响行数
		int rows = 0;
		// 设置数组,填充占位符
		Object[] params = {account.getAccount_money(), account.getAccountId()};
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句并返回影响行数
		try {
			rows = qr.update(JdbcUtils.getConnection(), sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	/* (non-Javadoc)
	 * @see com.life.dao.IAccountDao#accountLog(com.life.po.AccountLog)
	 * 添加日志
	 */
	@Override
	public int accountLog(AccountLog accountlog) {
		// sql
		String sql = "insert into account_log(accountId, transfer_account, type, log_time, money) values(?,?,?,?,?)";
		// 初始化影响行数
		int rows = 0;
		// 设置数组,填充占位符
		Object[] params = {accountlog.getAccountId(), accountlog.getTransfer_account(), accountlog.getType(), accountlog.getLog_time(), accountlog.getMoney()};
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句并返回影响行数
		try {
			rows = qr.update(JdbcUtils.getConnection(), sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	/* (non-Javadoc)
	 * @see com.life.dao.IAccountDao#transferAccounts(com.life.po.Account)
	 * 取钱
	 */
	@Override
	public int transferAccounts(Account account) {
		// sql
		String sql = "update account set account_money = account_money - ? where accountId = ?";
		// 初始化影响行数
		int rows = 0;
		// 设置数组来填充占位符
		Object[] params = {account.getAccount_money(), account.getAccountId()};
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句并返回执行结果
		try {
			rows = qr.update(JdbcUtils.getConnection(), sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}
	
	/* (non-Javadoc)
	 * @see com.life.dao.IAccountDao#selectAccount(com.life.po.Account)
	 * 查询账户
	 */
	@Override
	public Account selectAccountId(Account accountId) {
		// sql
		String sql = "select * from account where accountid = ?";
		// 初始化实体类
		Account account1 = null;
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句并返回实体类
		try {
			account1 = qr.query(sql, new BeanHandler<>(Account.class), accountId.getAccountId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return account1;
	}

	/* (non-Javadoc)
	 * @see com.life.dao.IAccountDao#IncomeSum(java.lang.String, int, java.util.Date)
	 * 当月收入支出统计
	 */
	@Override
	public BigDecimal statistics(AccountLog accountlog) {
		// sql
		String sql = "SELECT sum(money) FROM `account_log` WHERE accountid = ? AND `type` = ?";
		// 初始化统计结果
		BigDecimal rows = null;
		// 设置数组填充占位符
		Object[] params = {accountlog.getAccountId(), accountlog.getType()};
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句并返回实体类
		try {
			rows = qr.query(sql, new ScalarHandler<BigDecimal>(), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

}












