package com.hpe.TelJdbcAssigment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*业务层（控制层C）：主要实现电话本的增、删、改、查*/
public class TelMange {
	
	public Connection myLoad() {
		//初始化Connection接口
		Connection conn = null;
		try {
			//加载mysql驱动
			Class.forName("com.mysql.jdbc.Driver");
			//连接数据库
			String url = "jdbc:mysql://127.0.0.1:3306/telephone";
			String user = "root";
			String password = "123456";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/* function:电话话本的增加
	 	return:1 添加成功
				-1：联系人存在
	*/
	public int myAdd(PeopleInfo pi) {
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		if (pi.getName().equals(pi.getName())) {
		//if(true) {
			try {
				//连接数据库
				conn = myLoad();
				//插入sql语句
				String sql = "insert into tele(tname,tsex,tage,telNo,tqq,tdir) values(?,?,?,?,?,?)";
				
				try {
					//sql语句被预编译并存储到PreparedStatement对象中
					ps = conn.prepareStatement(sql);
					//设置手动提交事务
					conn.setAutoCommit(false);
					//调用PreparedStatement对象的set方法,设置问号占位符上的参数
					ps.setString(1, pi.getName());
					ps.setString(2, pi.getSex());
					ps.setInt(3, pi.getAge());
					ps.setString(4, pi.getTelNo());
					ps.setString(5, pi.getQQ());
					ps.setString(6, pi.getDir());
					//返回执行行数
					result = ps.executeUpdate();
					//提交事务
					conn.commit();
					
					//关闭资源
					ps.close();
					conn.close();
				} catch (Exception e) {
					//回滚事务
					conn.rollback();
					e.printStackTrace();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
		}
		return -1;
	}

	// 电话话本的删除
	public boolean myDel(String name) {
		// 首先找到要删除的联系人
		String p = mySelect(name);
		if (p == null) {
			return false;
		}
		//初始化数据库驱动和预编译对象
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//连接数据库
			conn = myLoad();
			//插入sql语句
			String sql = "delete from tele where tname = ?";
			
			try {
				//将sql语句填充到预编译对象中
				ps = conn.prepareStatement(sql);
				//设置手动提交事务
				conn.setAutoCommit(false);
				ps.setString(1, name);
				ps.executeUpdate();
				//提交事务
				conn.commit();
				
				//释放资源
				ps.close();
				conn.close();
			} catch (Exception e) {
				//回滚事务
				conn.rollback();
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}

	// 电话话本的修改
	public boolean myUpdate(PeopleInfo pi,String name) {
		/*根据姓名先找到该联系人--已交给UI界面*/
		/*如果找到*/
		Connection conn = null;//初始化连接数据库驱动
		PreparedStatement ps = null;//初始化预编译对象
		int result = 0;
		try {
			//实例化连接数据库对象
			conn = myLoad();
			//创建sql语句
			String sql = "update tele set tname = ?,tsex = ?,tage = ?,telNo = ?,tqq = ?,tdir = ? where tname = ?";
			try {
				//将sql语句填充到预编译对象中
				ps = conn.prepareStatement(sql);
				//设置手动提交事务
				conn.setAutoCommit(false);
				//调用PreparedStatement的set方法设置sql语句中的站位符
				ps.setString(1, pi.getName());
				ps.setString(2, pi.getSex());
				ps.setInt(3, pi.getAge());
				ps.setString(4, pi.getTelNo());
				ps.setString(5, pi.getQQ());
				ps.setString(6, pi.getDir());
				ps.setString(7, name);
				//执行sql语句
				result = ps.executeUpdate();
				
				//提交事务
				conn.commit();
				
				//关闭资源
				ps.close();
				conn.close();
			} catch (Exception e) {
				conn.rollback();
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true : false;
	}
	
	// 电话话本的查询所有
	public void mySelect() {
		Connection conn = null;
		Statement stat = null;
		try {
			//连接mysql
			conn = myLoad();
			//获取执行sql语句的对象
			stat = conn.createStatement();
			//查询表所有字段
			String sql = "select * from tele";
			
			try {
				//调用执行者对象的方法,执行sql语句,返回值Result接口实现类的对象
				ResultSet rs = stat.executeQuery(sql);
				//遍历结果集,返回值为boolean
				while (rs.next()) {
					System.out.println(rs.getString("tname")+"\t"+rs.getString("tsex")+
							"\t"+rs.getInt("tage")+"\t"+rs.getString("telNo")+"\t"+
							rs.getString("tqq")+"\t"+rs.getString("tdir"));
				}
				//关闭资源
				rs.close();
				stat.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 电话话本指定名字的查询
	public String mySelect(String name) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//连接数据库
			conn = myLoad();
			//sql语句
			String sql = "select * from tele where tname = ?";
			try {
				//预处理对象
				ps = conn.prepareStatement(sql);
				ps.setString(1, name);
				//创建数据库结果集
				ResultSet rs = ps.executeQuery();
				//判断单个查询的名字是否符合
				while (rs.next()) {
					//根据名字查找联系人
					if (name.equals(rs.getString("tname"))) {
						return rs.getString("tname")+"\t"+rs.getString("tsex")+"\t"+
								rs.getInt("tage")+"\t"+rs.getString("telNo")+"\t"+
								rs.getString("tqq")+"\t"+rs.getString("tdir");
					}
				}
				//关闭资源
				ps.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//如果存在则直接返回，否则返回null
		return null;
	}
}
