/**
 * 
 */
package com.zw.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.zw.dao.IAssetDao;
import com.zw.dao.IBankDao;
import com.zw.dao.impl.AssetDaoImpl;
import com.zw.dao.impl.BankDaoImpl;
import com.zw.po.Bank;
import com.zw.service.IBankService;
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
public class BankServiceImpl implements IBankService {

	/* (non-Javadoc)
	 * @see com.zw.service.IBankService#addBank(com.zw.po.Bank)
	 */
	private IBankDao bankDao = new BankDaoImpl();
	
	private IAssetDao assetDao = new AssetDaoImpl();
	
	@Override
	public int addBank(Bank bank) {
		
		//根据用户输入的银行名称查询,如果查询结果不为null,银行存在
		Bank bk = bankDao.selectBankName(bank.getBankName());
		
		if (bk != null) {
			//银行已经存在
			return -1;
		} else {
			//银行不存在
			return bankDao.addBank(bank);
		}
		
	}

	/* (non-Javadoc)
	 * @see com.zw.service.IBankService#selectBank()
	 * 查询所有银行
	 */
	@Override
	public List<Bank> selectBank() {
		
		return bankDao.selectBank();
	}

	/* (non-Javadoc)
	 * @see com.zw.service.IBankService#updateBank(com.zw.po.Bank)
	 */
	@Override
	public int updateBank(Bank bank) {
		
		//根据银行编号查询
		Bank bank1 = bankDao.selectBankID(bank.getBankId());
		//根据银行名称查询
		Bank bank2 = bankDao.selectBankName(bank.getBankName());
		
		if (bank1 == null) {
			return -1;//如果bank1等于null,表示银行不存在
		} else if(bank2 != null && bank2.getBankName().equals(bank.getBankName()) && bank2.getBankId() != bank.getBankId()) {
			return -2;//名字已经存在
		} else {
			return bankDao.updateBank(bank);
		}
		
	}

	/* (non-Javadoc)
	 * @see com.zw.service.IBankService#deleteBank(int)
	 * 根据银行编号删除银行
	 */
	@Override
	public boolean deleteBank(int bankId) {
		
		//初始化变量标识执行结果
		boolean falg = false;
		try {
			//开启事务
			JdbcUtils.beginTranscation();
			//清户
			assetDao.deleteAsset(bankId);
			//删除银行
			bankDao.deleteBank(bankId);
			//提交事务
			JdbcUtils.commitTranscation();
			//提交成功后返回true;
			falg = true;
		} catch (Exception e) {
			//回滚事务
			try {
				JdbcUtils.rollbackTranscation();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return falg;
	}

}
