package com.hpe.jdbcobjectSSS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 	JDBC事务处理:提交、回滚
 */
public class Test2 {
	public static void main(String[] args) {
		//加载mysql的驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//连接数据库
		String url = "jdbc:mysql://127.0.0.1:3306/productorder";//资源路径
		String user = "root";//连接数据库账号
		String password = "123456";//连接数据密码
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);//获得连接
			
			//执行语句
			String sql = "delete from product where pid = 5";
			
			Statement s1 = conn.createStatement();
			
			try {
				//设置为手动提交
				conn.setAutoCommit(false);
				
				//执行操作
				s1.executeUpdate(sql);
				
				//提交事务
				conn.commit();
				
				//再将事务改为默认提交
				conn.setAutoCommit(true);
				
			} catch (Exception e) {
				//回滚事务,回滚到执行语句之前
				conn.rollback();
				e.printStackTrace();
			}
			
			//关闭资源
			s1.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
