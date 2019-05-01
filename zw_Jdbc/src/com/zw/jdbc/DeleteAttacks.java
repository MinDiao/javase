package com.zw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 手动版JDBC删除,方法一
 * 1.DriverManager 管理一组jdbc驱动服务,负责创建Connection对象.
 * 2.Connection连接对象,负责和数据库进行连接,只有连接成功后才能对数据库进行相应的操作,
 * 		在连接前,需要知道数据库的连接地址,用户名和密码
 * 3.执行对象一共有两种
 * 		第一种:Statement用Connection对象进行创建,负责把sql语句发送给数据库服务器,
 * 		但缺点:需要拼接sql语句,不安全,容易引起sql注入
 */
public class DeleteAttacks {
	
	public static void main(String[] args) {
		//创建连接对象
		Connection conn = null;
		//定义一个执行对象
		Statement st = null;
		//创建一个变量接收数据库服务器返回结果
		int result = 0;
		
		try {//抓异常
			
			/*第一步：加载驱动包*/
			Class.forName("com.mysql.jdbc.Driver");//Driver是类
			
			/*第二步：建立连接*/
			//1.数据库的连接地址
			String url = "jdbc:mysql://127.0.0.1:3306/student";
			//2.数据库的用户名
			String user = "root";
			//3.数据库密码
			String password = "123456";
			//建立连接
			conn = DriverManager.getConnection(url, user, password);
		
			System.out.println(conn);
			
			/*第三步:创建执行对象*/
			//sql语句
			String id = "1";
			
			//sql注入
			/*String id = "2 or 1 = 1";*/
			
			String sql = "delete from stu where stuid =" + id;
			st = conn.createStatement();
			/*第四步:执行并返回结果*/
			result = st.executeUpdate(sql);//需要传递sql语句
			
		} catch (Exception e) {//处理异常
			e.printStackTrace();
		} finally {
			try {
				/*第五步:关闭连接*/
				st.close();//销毁执行对象
				conn.close();//关闭连接通道
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		if (result > 0) {
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
		
	}
	
}
