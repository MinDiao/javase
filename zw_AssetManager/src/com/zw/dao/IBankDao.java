/**
 * 
 */
package com.zw.dao;

import java.util.List;

import com.zw.po.Bank;

/** 
 * 	类描述:银行数据访问接口
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月5日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public interface IBankDao {
	
	/**
	 * 
	 * 	方法描述：添加银行
	 * 	@param bank 银行信息
	 * 	@return 影响的行数
	 */
	int addBank(Bank bank);
	
	/**
	 * 
	 * 	方法描述：根据银行名称查询
	 * 	@param name 银行名
	 * 	@return 银行信息
	 */
	Bank selectBankName(String name);
	
	/**
	 * 
	 * 	方法描述：查询所有银行信息
	 * 	@return 银行信息
	 */
	List<Bank> selectBank();
	
	/**
	 * 
	 * 	方法描述：修改银行
	 * 	@param bank 银行信息
	 * 	@return 影响行数
	 */
	int updateBank(Bank bank);
	
	/**
	 * 
	 * 	方法描述：根据银行编号查询
	 * 	@param bankId 银行编号
	 * 	@return 影响的行数
	 */
	Bank selectBankID(int bankId);
	
	/**
	 * 
	 * 	方法描述：删除银行
	 * 	@param bankId 银行编号
	 * 	@return 影响的行数
	 */
	int deleteBank(int bankId);
	
}
