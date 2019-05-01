package com.tel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tel.po.Person;
import com.tel.util.JdbcUtil;

/*
 * 数据访问层，主要和数据库打交道，对数据库进行CRUD操作
 */
public class PersonDao {

	//初始化连接对象
	Connection conn = null;
	//初始化执行对象
	PreparedStatement ps = null;
	//初始化结果集
	ResultSet rs = null;
	//初始化集合,存放学生信息
	List<Person> list = null;
	//初始化状态变量
	int result = 0;
	//初始化实体类
	Person per = null;

	/*查询所有*/
	public List<Person> getPersonAll(){
		try {
			//建立连接
			conn = JdbcUtil.getconnection();
			//创建sql语句,建立执行对象
			String sql = "select * from person";
			ps = conn.prepareStatement(sql);
			//执行并返回结果集
			rs = ps.executeQuery();
			//实现List接口
			list = new ArrayList<Person>();
			//遍历结果集
			while (rs.next()) {
				//实例化实体类
				per = new Person();
				//把结果集中的每一条数据添加到结果集中
				per.setTname(rs.getString("tname"));
				per.setTsex(rs.getString("tsex"));
				per.setTage(rs.getInt("tage"));
				per.setTtel(rs.getString("ttel"));
				per.setTqq(rs.getString("tqq"));
				per.setTaddr(rs.getString("taddr"));
				//将Person实例化对象存储到List集合中
				list.add(per);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
			per = null;
		}
		return list;
	}

	/*根据姓名查询用户*/
	public List<Person> getPersonName(String name){
		try {
			//建立连接
			conn = JdbcUtil.getconnection();
			//创建sql语句,建立执行对象
			String sql = "select * from person where tname = ?";
			ps = conn.prepareStatement(sql);
			//设置预编译属性填充占位符
			ps.setString(1, name);
			//执行并返回结果集
			rs = ps.executeQuery();
			//实现List接口
			list = new ArrayList<Person>();
			//遍历结果集
			while (rs.next()) {
				if (name.equals(rs.getString("tname"))) {
					//实例化实体类
					per = new Person();
					//把结果集中的每一条数据添加到结果集中
					per.setTname(rs.getString("tname"));
					per.setTsex(rs.getString("tsex"));
					per.setTage(rs.getInt("tage"));
					per.setTtel(rs.getString("ttel"));
					per.setTqq(rs.getString("tqq"));
					per.setTaddr(rs.getString("taddr"));
					//将Person实例化对象存储到List集合中
					list.add(per);
				}
				return list;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
			per = null;
		}
		return null;
	}

	/*添加用户*/
	public int addPerson(Person per) {
		try {
			//建立连接
			conn = JdbcUtil.getconnection();
			//创建sql语句,建立执行对象
			String sql = "insert into person(tname,tsex,tage,"
					+ "ttel,tqq,taddr) values(?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			//为数据库添加数据
			ps.setString(1, per.getTname());
			ps.setString(2, per.getTsex());
			ps.setInt(3, per.getTage());
			ps.setString(4, per.getTtel());
			ps.setString(5, per.getTqq());
			ps.setString(6, per.getTaddr());
			//执行并返回执行状态
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
		}
		return result;
	}
	
	/*修改信息*/
	public int updatePerson(Person per, String name) {
		try {
			//建立连接
			conn = JdbcUtil.getconnection();
			//创建sql语句,建立执行对象
			String sql = "update person set tname = ?,tsex = ?,"
					+ "tage = ?,ttel = ?,tqq = ?,taddr = ? "
					+ "where tname = ?";
			ps = conn.prepareStatement(sql);
			//为数据库添加数据
			ps.setString(1, per.getTname());
			ps.setString(2, per.getTsex());
			ps.setInt(3, per.getTage());
			ps.setString(4, per.getTtel());
			ps.setString(5, per.getTqq());
			ps.setString(6, per.getTaddr());
			ps.setString(7, name);
			//执行并返回执行状态
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
		}
		return result;
	}
	
	/*删除信息*/
	public int deletePerson(String name) {
		try {
			//建立连接
			conn = JdbcUtil.getconnection();
			//创建sql语句,建立执行对象
			String sql = "delete from person where tname = ?";
			ps = conn.prepareStatement(sql);
			//为数据库添加数据
			ps.setString(1, name);
			//执行并返回执行状态
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
		}
		return result;
	}

}
