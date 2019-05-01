package com.tz.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * JDBC工具类测试
 */
public class JDBCUtilsTest {

	public static void main(String[] args) throws SQLException {
		//调用工具类的方法
		Connection conn = JDBCUtils.getconnection();
		//编写SQL
		String sql = "select sname from sort";
		//预编译
		PreparedStatement pst = conn.prepareStatement(sql);
		//处理结果集
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString("sname"));
		}
		//关闭资源
		JDBCUtils.close(conn, pst, rs);
	}

}
