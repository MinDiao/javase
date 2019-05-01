package com.hpe.jdbcobject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 	增、删、改
 */
public class Test1 {

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
			//System.out.println(conn);//检验是否连接成功，其实调用的toString方法
			
			//插入数据
			String sql = "insert into product(pid,pname,pprice,pdesc,pcount) values(5,'华为',2000,'华为',1000)";
			
			//修改数据
			String sql2 = "update product set pname = 'oppo',pprice = '2500' where pid = 5";
			
			//删除数据
			String sql3 = "delete from product where pid = 5";
			
			Statement stm = conn.createStatement();
			int result = stm.executeUpdate(sql3);//增删改都用executeUpdate()方法
			System.out.println(result);//返回影响几行数据
			//关闭资源
			conn.close();
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
