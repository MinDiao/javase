package com.tz.jdbcC3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mchange.v2.c3p0.ComboPooledDataSource;
/*
 * 手动设置参数的方法：c3p0连接池
 * 创建连接池
 *  ComboPooledDataSource cpds = new ComboPooledDataSource();
 */
public class JdbcC3p0 {

	public static void main(String[] args) {
		//初始化
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//获得连接,从连接池获取
			//创建连接池
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			//设置连接参数
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
			dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/telephone");
			dataSource.setUser("root");
			dataSource.setPassword("123456");
			//从连接池中获得连接
			conn = dataSource.getConnection();
			//编写sql
			String sql = "select * from tele";
			//预编译
			ps = conn.prepareStatement(sql);
			//执行sql语句
			rs = ps.executeQuery();
			//遍历结果集
			while (rs.next()) {
				System.out.println(rs.getString("tname")+"\t"+
						rs.getString("tsex")+"\t"+rs.getInt("tage")+"\t"
						+rs.getString("telNo")+"\t"+rs.getString("tqq")+
						"\t"+rs.getString("tdir"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//调用其他包中的关闭资源
			JdbcC3p0XMLUtils.close(conn, ps, rs);
		}
	}

}
