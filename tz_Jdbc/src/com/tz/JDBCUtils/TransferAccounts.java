package com.tz.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransferAccounts {

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
			
			//编写SQL语句 ?是站位符,防止SQL注入
			String sql = "update account set  money = money + ? where name = ?";
			
			//预编译
			pstem = con.prepareStatement(sql);
			
			//设置参数
			//aaa转账给bbb账号1000
			pstem.setDouble(1, -1000);
			pstem.setString(2, "aaa");
			//执行SQL 扣除aaa账号1000
			pstem.executeUpdate();
			
			//给bbb加1000
			pstem.setDouble(1, +1000);
			pstem.setString(2, "bbb");
			pstem.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtilsPZWJ.close(con, pstem);
		}
	}
}
