package com.tz.jdbcDBUtils;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.tz.jdbcC3p0.JdbcC3p0XMLUtils;

/*
 * BeanHandler:将一条数据封装到javabean中
 * BeanListHandler:将多条记录封装到一个装有javabean的list集合中
 */
public class BeanHandlerBeanListHandler {

	/*
	 * BeanHandler:将一条数据封装到javabean中
	 */
	@Test
	public void demo1() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JdbcC3p0XMLUtils.getDataSource());
		Tele tele = queryRunner.query("select * from tele where tid = ?", new BeanHandler<Tele>(Tele.class), 2);
		System.out.println(tele);
	}
	
	/*
	 * BeanListHandler:将多条记录封装到一个装有javabean的list的集合中
	 */
	@Test
	public void demo2() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JdbcC3p0XMLUtils.getDataSource());
		List<Tele> list = queryRunner.query("select * from tele", new BeanListHandler<Tele>(Tele.class));
		for (Tele tele : list) {
			System.out.println(tele);
		}
	}
}
