package com.tz.jdbcDBUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.junit.Test;

import com.tz.jdbcC3p0.JdbcC3p0XMLUtils;

/*
 * 	查询操作
 * 	结果处理集的接口：Interface ResultSetHandler<T>
 */
public class SelectResultSetHandler {
	/*
	 * 	查询一条记录
	 */
	@Test
	public void demo1() throws SQLException {
		//创建核心类
		QueryRunner queryRunner = new QueryRunner(JdbcC3p0XMLUtils.getDataSource());
		//执行查询
		Tele tele = queryRunner.query("select * from tele where tid = ?", new ResultSetHandler<Tele>() {

			@Override
			public Tele handle(ResultSet rs) throws SQLException {
				Tele tele = new Tele();
				if (rs.next()) {
					tele.setTid(rs.getInt("tid"));
					tele.setTname(rs.getString("tname"));
					tele.setTage(rs.getInt("tage"));
				}
				return tele;
			}
			
		}, 1);
		
		System.out.println(tele);
	}
	
	/*
	 * 	查询多条纪录
	 * 	多条纪录应该是一个集合 集合里面放的account，因为一条是一个account，多条纪录就是装有account的集合
	 */
	@Test
	public void demo2() throws SQLException {
		//创建核心类
		QueryRunner queryRunner = new QueryRunner(JdbcC3p0XMLUtils.getDataSource());
		//执行查询
		List<Tele> list = queryRunner.query("select * from tele", new ResultSetHandler<List <Tele>>() {

			@Override
			public List<Tele> handle(ResultSet rs) throws SQLException {
				//创建一个集合用于封装数据
				List<Tele> list = new ArrayList<Tele>();
				while (rs.next()) {
					//将结果集的数据封装到对象中
					Tele tele = new Tele();
					tele.setTid(rs.getInt("tid"));
					tele.setTname(rs.getString("tname"));
					tele.setTage(rs.getInt("tage"));
					//将这个对象放入集合中
					list.add(tele);
				}
				return list;
			}
			
		});
		//遍历集合
		for (Tele tele : list) {
			System.out.println(tele);
		}
	}
}
