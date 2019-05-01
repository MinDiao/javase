/**
 * 
 */
package com.zw.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.zw.dao.IAdminDao;
import com.zw.po.Admin;
import com.zw.util.JdbcUtils;

/** 
 * 类描述：数据访问层管理员接口实现类
 * 作者： LiuJinrong 
 * 创建日期：2018年11月2日
 * 修改人：
 * 修改日期：
 * 修改内容：
 * 版本号： 1.0.0   
 */
public class AdminDaoImpl implements IAdminDao{

	/* (non-Javadoc)
	 * @see com.zw.dao.AdminDao#login(com.zw.po.Admin)
	 */
	@Override
	public Admin login(Admin admin) {
		//1.sql
		String sql = "select * from admin where adminname = ? and adminpassword = ?";
		//定义一个数组,存储占位符的值
		Object[] params = {admin.getAdminName(), admin.getAdminPassword()};
		//创建对象,接受返回结果
		Admin ad = null;
		//创建QueryRunner对象,通过构造器获取数据源
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//执行查询操作,BeanHandler:将结果集中第一行数据封装到对应的实体类中
		try {
			ad = qr.query(sql, new BeanHandler<>(Admin.class), params);//使用反射的方式
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ad;
	}
	
}
