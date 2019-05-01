package com.tz.TestOracle01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCconnectionTest02 {
	public static void main(String[] args) {
		testConnection();
	}
	
	public static void testConnection(){
		//声明数据库连接对象
		Connection con = null;
		//创建预编译对象
		PreparedStatement pre = null;
		//创建结果集对象
		ResultSet rs = null;
		
		try {
			con = getConnection();
			
			//SQL语句
			String sql = "SELECT EMPNO,ENAME,JOB FROM EMP WHERE DEPTNO = 20";
			
			//实例化预编译语句
			pre = con.prepareStatement(sql);
			
			//执行查询,获取结果集
			rs = pre.executeQuery();
			
			while (rs.next()) {
				//根据字段下标来取值,不利于维护
				System.out.println("员工号:" + rs.getInt(1) + 
						",姓名:" +rs.getString(2) + ",岗位:" + rs.getString("JOB"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, pre, rs);
		}
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con;
		//加载驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//地址
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		//账号密码
		String user = "scott";
		String password = "123456";
		
		con = DriverManager.getConnection(url, user, password);
		return con;
	}

	public static void closeConnection(Connection con, PreparedStatement pre, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pre != null) {
				pre.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
