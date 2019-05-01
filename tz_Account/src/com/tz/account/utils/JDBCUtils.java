/**
 * 
 */
package com.tz.account.utils;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

/** 
 * 	类描述：使用dbcp连接池连接数据库
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月3日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class JDBCUtils {
	
	//创建BasicDataSource对象
	private static BasicDataSource datasource = new BasicDataSource();
	//静态代码块
	static {
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/account");
		datasource.setUsername("root");
		datasource.setPassword("123456");
		datasource.setMaxActive(10);
		datasource.setMaxIdle(5);
		datasource.setMinIdle(2);
		datasource.setInitialSize(10);
	}
	
	public static DataSource getDataSource() {
		return datasource;
	}
	
}
