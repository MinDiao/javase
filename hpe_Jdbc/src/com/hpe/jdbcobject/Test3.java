package com.hpe.jdbcobject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * 	查
 */
public class Test3 {
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
		try {
			Connection conn = DriverManager.getConnection(url, user, password);//获得连接
			
			//查询数据
			String sql = "select * from recruit where rid = ?";
			
			//预处理对象
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 1);
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				//打印列
				String dname1 = result.getString(4);//指定第几列的方式
				String dname2 = result.getString("vid");//指定列名的方式
				System.out.println(dname1);
				System.out.println(dname2);
			}
		
			conn.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
