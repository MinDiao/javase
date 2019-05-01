package com.tz.TestOracle02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDao {
	public void addEmp(Emp emp) throws ClassNotFoundException, SQLException {
		//数据库连接对象
		Connection con = null;
		//预编译对象
		PreparedStatement pre = null;
		//结果集对象
		ResultSet rs = null;
		
		//获取连接:返回数据的连接对象
		con = DButils.getConnection();
		
		//SQL语句,几个字段写几个问号
		String sql = "INSERT INTO EMP(EMPNO,ENAME,JOB,SAL,DEPTNO) VALUES(?,?,?,?,?)";
		
		pre = con.prepareStatement(sql);
		pre.setInt(1, emp.getEmpno());
		pre.setString(2, emp.getEname());
		pre.setString(3, emp.getJob());
		pre.setDouble(4, emp.getSal());
		pre.setInt(5, emp.getDeptno());
		
		int rows = pre.executeUpdate();
		
		DButils.closeConnection(con, pre, rs);
		
		if (rows > 0) {
			System.out.println("成功新增" + rows + "条数据");
		} else {
			System.out.println("新增失败");
		}
	}
	
	/*删*/
	public boolean delEmp(int empno) throws ClassNotFoundException, SQLException {
		boolean flag = false;
		//数据库连接对象
		Connection con = null;
		//预编译对象
		PreparedStatement pre = null;
		//结果集对象
		ResultSet rs = null;
		
		//获取连接:返回数据的连接对象
		con = DButils.getConnection();
		
		//SQL语句,几个字段写几个问号
		String sql = "DELETE FROM EMP WHERE EMPNO = ?";
		
		pre = con.prepareStatement(sql);
		pre.setInt(1, empno);
		
		int rows = pre.executeUpdate();
		
		DButils.closeConnection(con, pre, rs);
		
		if (rows > 0) {
			System.out.println("成功删除" + rows + "条数据");
			flag = true;
		}
		return false;
	}
	
	/*改*/
	public int updateEmp(Emp emp) throws ClassNotFoundException, SQLException {
		int rows = 0;
		
		//数据库连接对象
		Connection con = null;
		//预编译对象
		PreparedStatement pre = null;
		//结果集对象
		ResultSet rs = null;
		
		//获取连接:返回数据的连接对象
		con = DButils.getConnection();
		
		String sql = "UPDATE EMP SET ENAME = ? WHERE EMPNO = ?";
		
		pre = con.prepareStatement(sql);
		pre.setString(1, emp.getEname());
		pre.setInt(2, emp.getEmpno());
		
		rows = pre.executeUpdate();
		
		DButils.closeConnection(con, pre, rs);
		
		if (rows > 0) {
			System.out.println("成功更新" + rows + "条数据");
		}
		
		return rows;
	}
	
	/*查*/
	public void selEmp(int empno) throws ClassNotFoundException, SQLException {
		//数据库连接对象
		Connection con = null;
		//预编译对象
		PreparedStatement pre = null;
		//结果集对象
		ResultSet rs = null;
		
		//获取连接:返回数据的连接对象
		con = DButils.getConnection();
		
		String sql = "SELECT * FROM EMP WHERE EMPNO = ?";
		
		//预编译
		pre = con.prepareStatement(sql);
		
		//填充值
		pre.setInt(1, empno);
		
		rs = pre.executeQuery();
		
		while (rs.next()) {
			//根据字段下标来取值,不利于维护
			System.out.println("员工号:" + rs.getInt("EMPNO") + 
					",姓名:" +rs.getString("ENAME") + ",岗位:" + rs.getString("JOB"));
		}
	}
}
