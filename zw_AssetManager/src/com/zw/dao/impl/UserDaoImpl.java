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

import com.zw.dao.IUserDao;
import com.zw.po.User;
import com.zw.util.JdbcUtils;

/** 
 * 	类描述：用户实现数据处理层
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月6日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class UserDaoImpl implements IUserDao {

	/* (non-Javadoc)
	 * @see com.zw.dao.IUserDao#userLogin(com.zw.po.User)
	 * 	根据用户名和密码登录
	 */
	@Override
	public User userLogin(User user) {
		
		//sql
		String sql = "select * from user where username = ? and userpassword = ?";
		//填充占位符
		Object[] params = {user.getUserName(), user.getUserPassword()};
		//初始化实体类
		User user1 = null;
		//创建数据源
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//
		try {
			user1 = qr.query(sql, new BeanHandler<>(User.class), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user1;
	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IUserDao#register(com.zw.po.User)
	 * 	注册\添加用户
	 */
	@Override
	public Long register(User user) {
		//sql
		String sql = "INSERT INTO `user` (username, userpassword, realname, sex, tel, idCard, address) values(?, ?, ?, ?, ?, ?, ?)";
		//设置参数,填充占位符
		Object[] params = {user.getUserName(), user.getUserPassword(), user.getRealName(), user.getSex(), user.getTel(), user.getIdCard(), user.getAddress()};
		//初始化影响行数
		Long rows = null;
		//创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//执行添加
		try {
			
			/*insert 执行后返回表中插入行生成的主键值
			ScalarHandler<>(指定列,下标从0开始) 返回指定列的值,常用统计函数,默认返回第一列的值*/
			rows = qr.insert(sql, new ScalarHandler<Long>(), params);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IUserDao#selectUserName(java.lang.String)
	 * 	根据用户名查询
	 */
	@Override
	public User selectUserName(String name) {
		//sql
		String sql = "select * from user where username = ?";
		//初始实体类对象
		User user = null;
		//创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//执行sql语句
		try {
			user = qr.query(sql, new BeanHandler<>(User.class), name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IUserDao#updatePassword(com.zw.po.User, java.lang.String)
	 * 	根据用户输入的新密码修改当前登录用户的密码
	 */
	@Override
	public int updatePassword(User user, String newPassword) {
		
		//sql
		String sql = "update user set userpassword = ? where userid = ?";
		//初始化数据库返回执行影响行数
		int rows = 0;
		//设置数组来填充占位符
		Object[] params = {newPassword, user.getUserId()};
		//创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//执行sql语句
		try {
			rows = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rows;
	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IUserDao#selectAllUser()
	 * 查询所有用户
	 */
	@Override
	public List<User> selectAllUser() {
		
		// sql
		String sql = "select * from user";
		// 初始化List集合存放所有用户信息
		List<User> list= null;
		// 创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		// 执行sql语句，并返回所有员工的信息
		try {
			list = qr.query(sql, new BeanListHandler<>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回所有用户信息
		return list;
	}

}
