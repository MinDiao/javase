package com.tz.jdbcC3p0;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/*
 * c3p0连接池xml版改写工具类
 */
public class JdbcC3p0XMLUtils {
	//创建一个连接池,但只需要创建一次即可,可指定xml中的连接属性
	private static final ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	/*获得连接的方法*/
	public static Connection getconnection() throws SQLException {
		return dataSource.getConnection();
	}
	
	/*获得连接池*/
	public static DataSource getDataSource() {
		return dataSource;
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
	
	/*释放资源-方法重载*/
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
