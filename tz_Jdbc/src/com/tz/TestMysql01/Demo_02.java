package com.tz.TestMysql01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * jdbc技术,查询数据表,获取结果集
 */
public class Demo_02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		 * 1.注册驱动
		 * 2.获取连接对象
		 * 3.获取执行SQL语句对象
		 * 4.调用执行者对象的方法,执行SQL语句
		 * 5.处理结果集
		 * 6.关闭资源
		 */
		//1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.获取连接对象
		String url = "jdbc:mysql://localhost:3306/ljr";
		String user = "root";
		String password = "123456";
		Connection con = DriverManager.getConnection(url, user, password);
	
		//3.获取执行SQL语句对象
		Statement stat = con.createStatement();
			//查询语句
			String sql = "SELECT * FROM SORT";
		
		//4.调用执行者对象的方法,执行SQL语句,返回值ResultSet接口实现类的对象
		ResultSet rs = stat.executeQuery(sql);
		
		//5.处理结果集 resultset boolean next 返回true,有结果集,返回false则没有
		while (rs.next()) {
			//获取每列数据,使用getxxx方法
			System.out.println(rs.getInt("SID")+" "+rs.getString("SNAME")+" "
			+rs.getDouble("SPRICE")+" "+rs.getString("SDESC"));
		}
		
		//6.关闭资源
		rs.close();
		stat.close();
		con.close();
	}

}
