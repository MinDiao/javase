/**
 * 
 */
package com.life.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.life.dao.IUsersDao;
import com.life.po.Account;
import com.life.po.Users;
import com.life.utils.JdbcUtils;

/** 
 * 	类描述：用户实现类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月10日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class UsersDaoImpl implements IUsersDao {

	/* (non-Javadoc)
	 * @see com.life.dao.IUsersDao#login(java.lang.String, java.lang.String)
	 * 用户登录
	 */
	@Override
	public Users login(Users users) {
		// sql
		String sql = "select * from users where username = ? and userpassword = ?";
		// 初始化实体类
		Users users1 = null;
		// 设置数组用来填充占位符
		Object[] params = {users.getUserName(), users.getUserPassword()};
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句并返回实体类
		try {
			users1 = qr.query(sql, new BeanHandler<>(Users.class), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users1;
	}

	/* (non-Javadoc)
	 * @see com.life.dao.IUsersDao#selectUsersName(java.lang.String)
	 * 根据用户姓名查询
	 */
	@Override
	public Users selectUsersName(String name) {
		// sql
		String sql = "select * from users where username = ?";
		// 初始化实体类
		Users users1 = null;
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句并返回实体类
		try {
			users1 = qr.query(sql, new BeanHandler<>(Users.class), name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users1;
	}

	/* (non-Javadoc)
	 * @see com.life.dao.IUsersDao#insertUsers(com.life.po.Users)
	 * 注册\添加用户
	 */
	@Override
	public int insertUsers(Users users) {
		// sql
		String sql = "insert into users(username, userpassword, realname, tel, address, login_time) values(?,?,?,?,?,?)";
		// 初始化影响行数
		int rows = 0;
		// 设置数组用来填充占位符
		Object[] params = {users.getUserName(), users.getUserPassword(), users.getRealName(), users.getTel(), users.getAddress(), users.getLogin_time()};
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句,并返回影响行数
		try {
			rows = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	/* (non-Javadoc)
	 * @see com.life.dao.IUsersDao#insertAccount(com.life.po.Users)
	 * 根据注册好的用户id创建相应的银行id
	 */
	@Override
	public int insertAccount(Account account) {
		// sql
		String sql = "insert into account(userid, account_money) values(?, ?)";
		// 初始化影响行数
		int rows = 0;
		// 创建数组用来填充占位符
		Object[] params = {account.getUserId(), 0};
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句,并返回影响行数
		try {
			rows = qr.update(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
	}

	/* (non-Javadoc)
	 * @see com.life.dao.IUsersDao#updateTelAddress(java.lang.String, java.lang.String)
	 * 信息维护
	 */
	@Override
	public int updateTelAddress(Users users, String name) {
		// sql
		String sql = "update users set tel = ?, address = ? where username = ?";
		// 初始化影响行数
		int rows = 0;
		// 定义数组用来填充占位符
		Object[] params = {users.getTel(), users.getAddress(), name};
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句,并返回影响行数
		try {
			rows = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	/* (non-Javadoc)
	 * @see com.life.dao.IUsersDao#updatePassword(com.life.po.Users, java.lang.String)
	 * 密码修改
	 */
	@Override
	public int updatePassword(Users users, String name) {
		// sql
		String sql = "update users set userpassword = ? where username = ?";
		// 初始化影响行数
		int rows = 0;
		// 设置数组,填充占位符
		Object[] params = {users.getUserPassword(), name};
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

}
