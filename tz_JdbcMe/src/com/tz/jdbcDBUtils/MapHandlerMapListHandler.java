package com.tz.jdbcDBUtils;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.junit.Test;

import com.tz.jdbcC3p0.JdbcC3p0XMLUtils;

/*
 * MapHandler:将一条记录封装到一个Map集合中
 * MapListHandler:将多条记录封装到一个装有Map的List集合中
 */
public class MapHandlerMapListHandler {
	
	/*
	 * MapHandler:每一条记录封装到一个Map集合
	 */
	@Test
	public void demo1() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JdbcC3p0XMLUtils.getDataSource());
		Map<String, Object> map = queryRunner.query("select * from tele where tid = ?", new MapHandler(), 2);
		System.out.println(map);
	}
	
	/*
	 * MapListHandler:将多条记录封装到一个装有Map的List集合中
	 */
	@Test
	public void demo2() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JdbcC3p0XMLUtils.getDataSource());
		List<Map <String, Object>> list = queryRunner.query("select * from tele", new MapListHandler());
		for (Map<String, Object> map : list) {
			System.out.println(map);
		}
	}
	
}
