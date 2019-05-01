/**
 * 
 */
package com.zw.service;

import java.util.List;

import com.zw.po.Bank;

/** 
 * 	类描述：Bank服务层接口
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月5日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public interface IBankService {
	
	/**
	 * 
	 * 	方法描述：添加银行
	 * 	@param bank Bank对象
	 * 	@return 执行条数
	 */
	int addBank(Bank bank);
	
	/**
	 * 
	 * 	方法描述：查询所有银行
	 * 	@return 填充在List集合中的Bank对象
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
	 * 	方法描述：删除银行
	 * 	@param bankid 银行编号
	 * 	@return true 或 false
	 */
	boolean deleteBank(int bankId);

}
