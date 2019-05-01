/**
 * 
 */
package com.life.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/** 
 * 	类描述：JDBC工具类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月10日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class JdbcUtils {
	
	// 设置数据源，使用c3p0连接池
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource("mysql-config");
	
	// 创建一个与事务相关的局部变量，可保证多个执行在同一个连接下运行
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
	
	/**
	 * 
	 * 	方法描述：获取数据源
	 * 	@return 数据源对象
	 */
	public static DataSource getDataSource(){
		
		return dataSource;
	}
	
	/**
	 * 
	 * 	方法描述：获取连接
	 * 	@return
	 */
	public static Connection getConnection(){
		
		// 获取线程局部变量值Connection
		Connection conn = tl.get();
		if (conn == null) {
			// 如果连接为空，则从数据库连接池中获取连接
			try {
				conn = dataSource.getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	/**
	 * 
	 * 	方法描述：开启事务
	 * 	@throws SQLException
	 */
	public static void beginTranscation() throws SQLException{
		
		// 从线程中获取连接
		Connection conn = tl.get();
		if (conn != null) {
			throw new SQLException("不能重复开启事务");
		}
		// 获取连接
		conn = getConnection();
		// 关闭自动提交事务
		conn.setAutoCommit(false);
		// 将线程变量的值设置为connection
		tl.set(conn);
	}
	
	/**
	 * 
	 * 	方法描述：提交事务
	 * 	@throws SQLException
	 */
	public static void commitTranscation() throws SQLException{
		
		Connection conn = tl.get();
		if (conn == null) {
			throw new SQLException("没有开启事务,不能提交");
		}
		// 提交事务
		conn.commit();
		// 关闭连接
		conn.close();
		// 移除此线程局部变量的值
		tl.remove();
	}
	
	
	/**
	 * 
	 * 	方法描述：回滚事务
	 * 	@throws SQLException
	 */
	public static void rollbackTranscation() throws SQLException{
		
		Connection conn = tl.get();
		if (conn == null) {
			throw new SQLException("没有开启事务,不能回滚");
		}
		// 回滚事务
		conn.rollback();
		// 关闭连接
		conn.close();
		// 移除此线程局部变量的值
		tl.remove();
	}

}
