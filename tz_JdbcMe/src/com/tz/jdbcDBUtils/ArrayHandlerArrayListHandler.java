package com.tz.jdbcDBUtils;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.junit.Test;

import com.tz.jdbcC3p0.JdbcC3p0XMLUtils;

/*
 * ArrayHandler:
 * ArrayListHandler
 */
public class ArrayHandlerArrayListHandler {
	
	@Test
	public void demo1() throws SQLException {
		//ArrayHandler:将每一条记录封装到一个数组当中,这个数组应该是Object[]
		//创建核心类
		QueryRunner queryRunner = new QueryRunner(JdbcC3p0XMLUtils.getDataSource());
		Object[] obj = queryRunner.query("select * from tele where tid = ?", new ArrayHandler(),6);
		System.out.println(Arrays.toString(obj));
	}
	
	@Test
	public void demo2() throws SQLException {
		/*
		 * 	ArrayListHandler:将多条记录封装到Object[]的List集合中
		 * 	一条记录封装到Object[]中,多条就是多个Object[],那么多个Object数组将其存入List集合中即可
		 */
		//创建核心类
		QueryRunner queryRunner = new QueryRunner(JdbcC3p0XMLUtils.getDataSource());
		List<Object[]> list = queryRunner.query("select * from tele", new ArrayListHandler());
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
	}
	
}
