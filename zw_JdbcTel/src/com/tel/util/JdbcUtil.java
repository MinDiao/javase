package com.tel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * JDBC工具类
 */
public class JdbcUtil {
	//私有化变量
	private static String driverClassName;
	private static String url;
	private static String user;
	private static String password;
	
	//创建静态代码块,实例化类时只加载一次
	static {
		try {
			//传值
			driverClassName = "com.mysql.jdbc.Driver";
			url = "jdbc:mysql://127.0.0.1:3306/zwtel";
			user = "root";
			password = "123456";
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//加载驱动
	public static void loadDriver() {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//建立连接
	public static Connection getconnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//关闭资源
	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		conn = null;
		
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		ps = null;
		
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		rs = null;
	}
}
