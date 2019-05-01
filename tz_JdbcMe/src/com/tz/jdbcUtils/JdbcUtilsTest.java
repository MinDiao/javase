package com.tz.jdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*
 * JDBC工具类,手动配置测试类
 */
public class JdbcUtilsTest {

	public static void main(String[] args) {
		//初始化
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//sql语句
		String sql = "select * from person";
		
		try {
			//获取连接数据库
			conn = JdbcUtils.getconnection();
			//将sql语句填充到预编译PreparedStatement对象中
			ps = conn.prepareStatement(sql);
			//使用填充到ResultSet结果集中
			rs = ps.executeQuery();
			//遍历ResultSet结果集
			while (rs.next()) {
				System.out.println(rs.getString("pname")+"\t"+rs.getShort("page"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			JdbcUtils.close(conn, ps, rs);
		}
	}

}
