package com.tz.jdbcDBUtils;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import com.tz.jdbcC3p0.JdbcC3p0XMLUtils;

/*
 * DBUtils的增删改查的操作
 */
public class AddUpdateDelete {

	/*
	 *	 添加操作
	 */
	@Test
	public void demo1() throws SQLException {
		//创建核心类 QueryRunner
		QueryRunner queryRunner = new QueryRunner(JdbcC3p0XMLUtils.getDataSource());
		queryRunner.update("insert into tele(tname,tsex,tage) values('eee',?,?)", "aaa", 23);
	}

	/*
	 * 	修改操作
	 */
	@Test
	public void demo2() throws SQLException {
		//创建核心类 QueryRunner
		QueryRunner queryRunner = new QueryRunner(JdbcC3p0XMLUtils.getDataSource());
		queryRunner.update("update tele set tname = ?,tage = ? where tid = ?","bbb",35,7);
	}
	
	/*
	 * 	删除操作
	 */
	@Test
	public void demo3() throws SQLException {
		//创建核心类 QueryRunner
		QueryRunner queryRunner = new QueryRunner(JdbcC3p0XMLUtils.getDataSource());
		queryRunner.update("delete from tele where tid = ?", 7);
	}

}
