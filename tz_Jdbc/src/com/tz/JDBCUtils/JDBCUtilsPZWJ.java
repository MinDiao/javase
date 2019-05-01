package com.tz.JDBCUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/*
 * 	JDBCUtils配置文件方式
 */
public class JDBCUtilsPZWJ {
	//静态私有,一般工具类都是直接
	private	static final String driverClassName;
	private	static final String url;
	private	static final String user;
	private	static final String password;
	//编写一个静态代码块
	static {
		//获取属性文件内容
		Properties properties = new Properties();
		//解析一个属性文件,有load方法 load方法是输入流
		try {
			properties.load(new FileInputStream("src//db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//然后使用properties	使用getproperty(key)通过key获取需要的值
		driverClassName = properties.getProperty("driverClassName");
		url = properties.getProperty("url");
		user = properties.getProperty("user");
		password = properties.getProperty("password");
	}
	
	/*注册驱动*/
	public static void loadDriver() {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/*获得连接*/
	public static Connection getconnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/*释放资源*/
	public static void close(Connection conn, Statement st) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		conn = null;
		
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		st = null;
	}
	
	/*释放资源2*/
	public static void close(Connection conn, Statement st, ResultSet rs) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		conn = null;
		
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		st = null;
		
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
