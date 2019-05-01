package com.tz.TestOracle02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DButils {
	public static void closeConnection(Connection con, PreparedStatement pre, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pre != null) {
				pre.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con;
		//加载驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//地址
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		//账号密码
		String user = "scott";
		String password = "123456";
		
		con = DriverManager.getConnection(url, user, password);
		return con;
	}
}
