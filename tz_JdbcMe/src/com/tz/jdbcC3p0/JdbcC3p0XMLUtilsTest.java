package com.tz.jdbcC3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;
/*
 * c3p0连接池xml版改写工具类,JUnit测试类
 */
public class JdbcC3p0XMLUtilsTest {
	
	@Test
	public void demo() {
		//初始化
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//调用工具类获取连接
			conn = JdbcC3p0XMLUtils.getconnection();
			//编写sql语句
			String sql = "select * from tele";
			//预编译
			ps = conn.prepareStatement(sql);
			//执行sql语句
			rs = ps.executeQuery();
			//遍历结果集
			while (rs.next()) {
				System.out.println(rs.getString("tname")+
						"\t"+rs.getString("tsex")+
						"\t"+rs.getInt("tage")+"\t"+
						rs.getString("telNo")+"\t"+
						rs.getString("tqq")+"\t"+
						rs.getString("tdir"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			JdbcC3p0XMLUtils.close(conn, ps, rs);
		}
	}
}
