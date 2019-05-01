package com.zw.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 工具类
 */
public class JDBCUtil {
	//私有化变量
	private static String url;//地址
	private static String user;//用户名
	private static String password;//密码
	
	//静态代码块,在类中只加载一次
	static {
		try {
			//1.加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.传值
			url = "jdbc:mysql://127.0.0.1:3306/student";
			user = "root";
			password = "123456";
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*建立连接*/
	public static Connection getconnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/*关闭资源--如果只是传两个参数，则其中一个参数传null即可*/
	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if (conn != null) {//为空则并未关闭
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (ps != null) {//为空则并未关闭
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (rs != null) {//为空则并未关闭
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
