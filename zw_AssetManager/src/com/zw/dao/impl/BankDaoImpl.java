/**
 * 
 */
package com.zw.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.zw.dao.IBankDao;
import com.zw.po.Bank;
import com.zw.util.JdbcUtils;

/** 
 * 	类描述：
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月5日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class BankDaoImpl implements IBankDao {

	/* (non-Javadoc)
	 * @see com.zw.dao.IBankDao#addBank(com.zw.po.Bank)
	 * 添加银行
	 */
	@Override
	public int addBank(Bank bank) {
		//sql
		String sql = "insert into bank(bankname, banktel) values(?,?)";
		//参数列表
		Object[] params = {bank.getBankName(), bank.getBankTel()};
		//定义变量接受受影响的行数
		int result = 0;
		//创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//调用update,并接受处理后的值
		try {
			result = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IBankDao#selectBankName(java.lang.String)
	 * 根据银行姓名查询
	 */
	@Override
	public Bank selectBankName(String name) {
		//sql
		String sql = "select * from bank where bankname = ?";
		//初始化实体类,用于接受一行银行的属性
		Bank bank = null;
		//创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//调用query,并用实体类接受属性
		try {
			bank = qr.query(sql, new BeanHandler<>(Bank.class), name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bank;
	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IBankDao#selectBank()
	 * 查询所有银行
	 */
	@Override
	public List<Bank> selectBank() {
		
		//sql
		String sql = "SELECT * FROM bank";
		//初始化集合,用于接收多条实体类对象
		List<Bank> list = null;
		//创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//调用query,执行查询
		try {
			//BeanListHandler 将结果集中的每一行数据都封装到一个实体类中,最终把结果添加到list中
			list = qr.query(sql, new BeanListHandler<>(Bank.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	
	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IBankDao#updateBank(com.zw.po.Bank)
	 * 修改银行
	 */
	@Override
	public int updateBank(Bank bank) {
		
		//sql
		String sql = "update bank set bankname = ?, banktel = ? where bankid = ? and bankname = ?";
		//参数
		Object[] params = {bank.getBankName(), bank.getBankTel(), bank.getBankId(), bank.getBankName()};
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//初始化返回影响行数
		int rows = 0;
		try {
			rows = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IBankDao#selectBankID(int)
	 * 查询银行id
	 */
	@Override
	public Bank selectBankID(int bankId) {
		
		//sql
		String sql = "select * from bank where bankid = ?";
		//初始化实体类对象
		Bank bank = null;
		//创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//执行,并返回一条Bank对象
		try {
			bank = qr.query(sql, new BeanHandler<>(Bank.class), bankId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bank;
	}

	/* (non-Javadoc)
	 * @see com.zw.dao.IBankDao#deleteBank(int)
	 * 删除银行
	 */
	@Override
	public int deleteBank(int bankId) {
		
		//sql
		String sql = "delete from bank where bankid = ?";
		//初始化影响行数
		int rows = 0;
		//创建数据源核心类
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//执行，并返回影响行数
		try {
			// 执行事务时必须保证在同一个连接下
			rows = qr.update(JdbcUtils.getConnection(), sql, bankId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rows;
	}

}
