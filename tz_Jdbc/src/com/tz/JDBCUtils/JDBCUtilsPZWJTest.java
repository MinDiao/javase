package com.tz.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * JDBC配置文件版工具类测试 
 */
public class JDBCUtilsPZWJTest {

	public static void main(String[] args) throws SQLException {
		//调用工具类的方法
		Connection conn = JDBCUtilsPZWJ.getconnection();
		//编写SQL
		String sql = "select * from sort";
		//预编译
		PreparedStatement pst = conn.prepareStatement(sql);
		//处理结果集
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString("sdesc"));
		}
		//关闭资源
		JDBCUtilsPZWJ.close(conn, pst, rs);
	}

}
