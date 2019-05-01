package com.tz.jdbcUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/*
 * JDBC工具类,配置文件版
 */
public class JdbcUtilsPzwj {
	//初始化静态私有
	private static final String driverClassName;
	private static final String url;
	private static final String user;
	private static final String password;
	
	//静态代码块在实现类时首先会被加载
	static {
		/*Properties 类表示了一个持久的属性集。Properties 
		可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。*/
		Properties properties = new Properties();//获取属性文件内容
		//解析属性文件内容,并填充到properties对象中
		try {
			properties.load(new FileInputStream("src//db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//使用getproperty用指定的键在此属性列表中搜索属性
		driverClassName = properties.getProperty("driverClassName");
		url = properties.getProperty("url");
		user = properties.getProperty("user");
		password = properties.getProperty("password");
	}
	
	/*注册驱动*/
	public static void loadDriver() {
		try {
			//使用反射方式
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/*获得连接*/
	public static Connection getconnection() {
		Connection conn = null;
		//DriverManager管理一组 JDBC 驱动程序的基本服务。
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/*关闭资源*/
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
	
	/*关闭资源-方法重载*/
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
