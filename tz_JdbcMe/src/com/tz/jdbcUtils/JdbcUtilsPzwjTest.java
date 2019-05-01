package com.tz.jdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
/*
 * JDBC工具类,配置文件版测试类
 */
public class JdbcUtilsPzwjTest {
	
	public static void main(String[] args) {
		//键盘输入
		Scanner sc = new Scanner(System.in);
		System.out.println("输入添加的姓名");
		String name = sc.next();
		System.out.println("输入添加的年龄");
		String age = sc.next();
		//初始化
		Connection conn = null;
		PreparedStatement ps = null;
		//初始化更新条数状态
		int result = 0;
		//获得数据库连接
		conn = JdbcUtilsPzwj.getconnection();
		//设置sql语句
		String sql = "insert into person values(?,?)";
		
		try {
			//sql语句被预编译并填充到PreparedStatement对象中
			ps = conn.prepareStatement(sql);
			//调用预编译对象中set方法来填充sql语句的?,防止sql注入攻击
			ps.setString(1, name);
			ps.setString(2, age);
			//更新数据库
			result = ps.executeUpdate();
			//返回更新的状态
			System.out.println(result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			JdbcUtilsPzwj.close(conn, ps);
			sc.close();
		}
	}
	
}
