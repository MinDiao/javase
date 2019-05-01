/**
 * 
 */
package com.company.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.company.dao.CompanyDao;
import com.company.po.Company;
import com.company.utils.JdbcUtils;

/** 
 * 	类描述：数据访问层实现类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月4日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class CompanyDaoImpl implements CompanyDao {

	/* (non-Javadoc)
	 * @see com.company.dao.CompanyDao#selectAll(com.company.po.Company)
	 * 查询所有
	 */
	@Override
	public List<Company> selectAll() {
		
		//sql
		String sql = "SELECT e.*, d.deptName FROM emp e,detp d WHERE e.deptId = d.deptId";
		//创建集合,接收返回结果
		List<Company> list = null;
		//创建QueryRunner对象,通过构造器获取数据源
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//BeanListHandler:将多条记录封装到一个装有实体类的list的集合中
		try {
			list = qr.query(sql, new BeanListHandler<Company>(Company.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//返回装有对象的集合
		return list;
		
	}

	/* (non-Javadoc)
	 * @see com.company.dao.CompanyDao#selectName(java.lang.String)
	 * 指定姓名查询
	 */
	@Override
	public Company selectName(String param) {
		
		//sql
		String sql = "SELECT e.*, d.deptName FROM emp e,detp d WHERE e.deptId = d.deptId AND e.EmpName = ?";
		//创建对象,接收返回结果
		Company company = null;
		//创建QueryRunner对象,通过构造器获取数据源
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//BeanHandler:将结果集中第一条记录封装到实体类中
		try {
			company = qr.query(sql, new BeanHandler<Company>(Company.class), param);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return company;
	}

	/* (non-Javadoc)
	 * @see com.company.dao.CompanyDao#add(com.company.po.Company)
	 * 添加
	 */
	@Override
	public int add(Company company) {
		
		//sql
		String sql = "INSERT INTO emp(EmpID, EmpName, deptId, EmpBirthday, Empphone) VALUES(?,?,?,?,?)";
		//初始化执行结果
		int result = 0;
		//创建QueryRunner对象,通过构造器获取数据源
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//定义一个数组,存储占位符的值
		Object[] params = {company.getEmpID(), company.getEmpName(), company.getDeptId(), company.getEmpBirthday(), company.getEmpphone()};
		//获取实体类中的属性,向数据库中添加数据
		try {
			result = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	/* (non-Javadoc)
	 * @see com.company.dao.CompanyDao#update(com.company.po.Company, java.lang.String)
	 * 指定姓名修改电话本
	 */
	@Override
	public int update(Company company, String name) {
		
		//sql
		String sql = "UPDATE emp SET EmpID = ?, EmpName = ?, deptId = ?, EmpBirthday = ?, Empphone = ? WHERE EmpName = ?";
		//初始化执行结果
		int result = 0;
		//创建QueryRunner对象,通过构造器获取数据源
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//定义一个数组,存储占位符的值
		Object[] params = {company.getEmpID(), company.getEmpName(), company.getDeptId(), company.getEmpBirthday(), company.getEmpphone(), name};
		//先传递过来指定的姓名,再获取实体类中的属性,向数据库中添加数据
		try {
			result = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	/* (non-Javadoc)
	 * @see com.company.dao.CompanyDao#delete(java.lang.String)
	 * 	指定员工姓名进行删除
	 */
	@Override
	public int delete(String param) {

		//sql
		String sql = "DELETE FROM emp WHERE EmpName = ?";
		//初始化执行结果
		int result = 0;
		//创建QueryRunner对象,通过构造器获取数据源
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//传递过来指定姓名,删除数据库中的数据
		try {
			JdbcUtils.beginTranscation();
			result = qr.update(sql, param);
			JdbcUtils.commitTranscation();
		} catch (SQLException e) {
			try {
				JdbcUtils.rollbackTranscation();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		return result;
	}

}
