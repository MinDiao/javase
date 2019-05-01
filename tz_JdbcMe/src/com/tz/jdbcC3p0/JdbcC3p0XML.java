package com.tz.jdbcC3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/*
 * xml配置文件参数的方法：c3p0连接池
 * 创建连接池
 *  ComboPooledDataSource cpds = new ComboPooledDataSource();
 */
public class JdbcC3p0XML {
	
	public static void main(String[] args) {
		//初始化
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//获得连接,从连接池获取
			//创建连接池 默认去类路径下去查找c3p0-config.xml,指定你定义的名称
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			//从连接池中获得连接
			conn = dataSource.getConnection();
			//编写sql
			String sql = "select * from tele";
			//预编译
			ps = conn.prepareStatement(sql);
			//执行sql
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
			JdbcC3p0XMLUtils.close(conn, ps, rs);
		}
	}
	
}
