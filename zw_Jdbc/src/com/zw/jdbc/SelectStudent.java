package com.zw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.zw.po.Student;
/*
 * 手动版JDBC查询,使用集合存储对象进行遍历
 * ResultSet 结果集对象,查询结果返回的是一个结果集-针对查询使用,它是虚拟表,类似视图
 */
public class SelectStudent {

	public static void main(String[] args) {
		select();
	}
	
	public static void select() {
		//初始化连接对象
		Connection conn = null;
		//初始化连接对象
		PreparedStatement ps = null;
		//初始化结果集对象
		ResultSet rs = null;
		
		//定义一个集合去接受结果集中的值
		/*接口 = new 实现类*/
		List<Student> list = new ArrayList<Student>();
		
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
			String sql = "select * from stu";
			ps = conn.prepareStatement(sql);
			
			//4.执行并返回结果
			rs = ps.executeQuery();//不需要传递sql语句
			while (rs.next()) {//rs包含所有数据,next()表示向下走一行
				Student stu = new Student();
				stu.setStuid(rs.getInt("stuid"));
				/*stu.setStuid(rs.getInt(1));//通过字段列数获取*/
				stu.setStuname(rs.getString("stuname"));
				stu.setAge(rs.getInt("age"));
				stu.setAddress(rs.getString("address"));
				//向集合中添加数据
				list.add(stu);
			}
			/*遍历集合*/
			/*for (Student s : list) {
				System.out.println(s);
			}*/
			
			/*使用for循环遍历集合*/
			/*for (int i = 0; i < list.size(); i++) {
				Student s = list.get(i);
				System.out.println(s);
			}*/
			
			/*使用迭代器*/
			Iterator<Student> it = list.iterator();
			while (it.hasNext()) {//判断当前元素是否存在,并指向下一个
				Student s = it.next();
				System.out.println(s);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//5.关闭连接
				rs.close();//关闭结果集对象
				ps.close();//销毁执行对象
				conn.close();//关闭连接通道
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
