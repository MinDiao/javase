package com.tz.TestMysql01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 演示sql注入
 */
public class SqlAttack {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.获取连接对象
		String url = "jdbc:mysql://localhost:3306/ljr";
		String user = "root";
		String password = "123456";
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3.获取执行SQL语句对象
		Statement stat = con.createStatement();
			//键盘录入
			Scanner sc = new Scanner(System.in);
			String user1 = sc.nextLine();
			String password1 = sc.nextLine();
			//执行SQL语句查询用户名和密码
			String sql = "SELECT * FROM USER WHERE USERNAME = '"+user1+"+' and password = '"+password1+"'";
			System.out.println(sql);
			
			//结果集
			ResultSet rs = stat.executeQuery(sql);
			//遍历结果集
			while(rs.next()) {
				System.out.println(rs.getString("username")+" "+rs.getString("password"));
			}
			
		//6.关闭资源
		rs.close();
		stat.close();
		con.close();
		sc.close();
	}

}
