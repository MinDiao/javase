package com.hpe.TelJdbcUtilsAssigment;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*电话本jdbcutils工具类*/
public class JdbcUtils {
	/*静态私有常量*/
	private static final String driverClassName;
	private static final String url;
	private static final String user;
	private static final String password;
	
	/*静态代码块,执行类时首先执行*/
	static {
		//获取属性文件内容
		Properties properties = new Properties();
		//解析属性文件,并填充到properties对象中
		try {
			properties.load(new FileInputStream("src//db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//使用getproperties方法用指定的键在此属性列表中搜索属性
		driverClassName = properties.getProperty("driverClassName");
		url = properties.getProperty("url");
		user = properties.getProperty("user");
		password = properties.getProperty("password");
	}
	
	/*获取驱动*/
	public void lodaDriver() {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/*获取连接*/
	public Connection getconnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/*关闭资源*/
	public void close(Connection conn, Statement st) {
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
	
	/*关闭资源-方法重载*/
	public void close(Connection conn, Statement st, ResultSet rs) {
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
