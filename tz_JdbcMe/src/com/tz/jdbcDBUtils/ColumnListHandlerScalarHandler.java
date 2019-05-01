package com.tz.jdbcDBUtils;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.tz.jdbcC3p0.JdbcC3p0XMLUtils;

/*
 * ColumnListHandler:将结果集中指定的列的字段值,封装到一个List集合中
 * ScalarHandler:它是用于单数据,例如select count(*) from 表数据
 */
public class ColumnListHandlerScalarHandler {
	
	/*
	 * ColumnListHandler:将某列的值封装到List集合中
	 */
	@Test
	public void demo1() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JdbcC3p0XMLUtils.getDataSource());
		List<Object> list = queryRunner.query("select tname, tsex from tele", new ColumnListHandler<>("tname"));
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	/*
	 * ScalarHandler:单值封装
	 */
	@Test
	public void demo2() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JdbcC3p0XMLUtils.getDataSource());
		Object object = queryRunner.query("select count(*) from tele", new ScalarHandler<>());
		System.out.println(object);
	}
}
