package com.tz.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
 * 	转账的案例
 * 	使用JDBC事务管理
 * 	1.开始事务
 * 	2.如果没有出现异常就提交事务
 * 	3.如果出现了异常就回滚
 */
public class TransferAccountsCallBack {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstem = null;
		
		/*
		 * 	完成转账
		 * 	扣除某个账号的钱
		 * 	给另外一个账号加钱
		 */
		
		//获得链接
		try {
			con = JDBCUtilsPZWJ.getconnection();
			//1.开始事务
			con.setAutoCommit(false);
			
			//编写SQL语句 ?是站位符,防止SQL注入
			String sql = "update account set money = money + ? where name = ?";
			
			//预编译
			pstem = con.prepareStatement(sql);
			
			//设置参数
			//aaa转账给bbb账号1000
			pstem.setDouble(1, -1000);
			pstem.setString(2, "aaa");
			//执行SQL 扣除aaa账号1000
			pstem.executeUpdate();
			
			int i = 1 / 0;//异常
			
			//给bbb加1000
			pstem.setDouble(1, +1000);
			pstem.setString(2, "bbb");
			pstem.executeUpdate();
			
			//提交事务
			con.commit();
			
		} catch (SQLException e) {
			//回滚事务
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			JDBCUtilsPZWJ.close(con, pstem);
		}
	}
}
