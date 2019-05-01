package com.zw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.zw.po.Student;
import com.zw.util.JDBCUtil;

/*
 * 数据访问层，主要和数据库打交道，对数据库进行CRUD操作
 */
public class StudentDao {
	
	//查询所有学生信息
	public List<Student> getStudentAll(){
		//创建连接对象
		Connection conn = null;
		//执行对象
		PreparedStatement ps = null;
		//结果集
		ResultSet rs = null;
		//创建集合存放学生信息
		List<Student> list = new ArrayList<Student>();
		
		try {
			//建立连接
			conn = JDBCUtil.getconnection();
			//创建执行对象
			String sql = "select * from stu";
			ps = conn.prepareStatement(sql);
			//执行并返回结果集
			rs = ps.executeQuery();
			//遍历结果集
			while (rs.next()) {
				//把结果集中的每一条数据添加到实体中
				Student stu = new Student();
				stu.setStuid(rs.getInt("stuid"));
				stu.setStuname(rs.getString("stuname"));
				stu.setAge(rs.getInt("age"));
				stu.setAddress(rs.getString("address"));
				list.add(stu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, ps, rs);
		}
		return list;
		
	}
	
}
