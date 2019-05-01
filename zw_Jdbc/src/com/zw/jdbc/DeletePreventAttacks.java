package com.zw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/*
 * 手动版JDBC删除,方法二
 * 方法二:预编译,安全
 * PreparedStatement 预编译执行对象,它是Statement对象的子接口,
 * 把sql语句预编译并存储到PreparedStatement对象中,它允许该sql语句有占位符?问号
 * 它允许该sql语句有占位符?,创建完成后进行赋值,占位符的坐标从1开始
 */
public class DeletePreventAttacks {

	public static void main(String[] args) {
		
		//初始化连接对象
		Connection conn = null;
		//初始化连接对象
		PreparedStatement ps = null;
		//创建变量接受结果
		int result = 0;
		
		try {
			//1.加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.建立连接
			String url = "jdbc:mysql://127.0.0.1:3306/student";
			String user = "root";
			String password = "123456";
			conn = DriverManager.getConnection(url, user, password);
			//3.创建执行对象
			//sql语句
			String sql = "delete from stu where stuid = ?";
			ps = conn.prepareStatement(sql);
			//赋值
			ps.setInt(1, 2);
			//4.执行并返回结果
			result = ps.executeUpdate();//不需要传递sql语句
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//5.关闭连接
				ps.close();//销毁执行对象
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
