/**
 * 
 */
package com.life.service.impl;

import java.math.BigDecimal;
import java.sql.SQLException;

import com.life.dao.IAccountDao;
import com.life.dao.impl.AccountDaoImpl;
import com.life.po.Account;
import com.life.po.AccountLog;
import com.life.service.IAccountService;
import com.life.utils.JdbcUtils;

/** 
 * 	类描述：
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月11日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class AccountServiceImpl implements IAccountService {
	
	IAccountDao accountdao = new AccountDaoImpl();

	/* (non-Javadoc)
	 * @see com.life.service.IAccountService#selectAccount(com.life.po.Account)
	 */
	@Override
	public Account selectUserIdAccount(Account account) {
		
		return accountdao.selectUserIdAccount(account);
	}

	/* (non-Javadoc)
	 * @see com.life.service.IAccountService#saveMoney(com.life.po.Account)
	 * 存钱 + 添加到日志
	 */
	@Override
	public boolean saveMoney(Account account, AccountLog accountlog) {
		// 初始化执行结果为失败
		boolean falg = false;
		try {
			// 开启事务
			JdbcUtils.beginTranscation();
			// 存钱
			accountdao.saveMoney(account);
			// 添加存钱到日志
			accountdao.accountLog(accountlog);
			// 提交事务
			JdbcUtils.commitTranscation();
			// 执行成功
			falg = true;
		} catch (Exception e) {
			try {
				JdbcUtils.rollbackTranscation();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return falg;
	}

	/* (non-Javadoc)
	 * @see com.life.service.IAccountService#transferAccounts(com.life.po.Account, com.life.po.Account, double)
	 * 转账
	 */
	@Override
	public int transferAccounts(Account accountA, Account accountB, AccountLog accountlog) {
		int rows = 0;
		// 查询当前账户的钱是否足够转账
		Account account1 = accountdao.selectAccountId(accountA);
		// 查询对方账户是否存在
		Account account2 = accountdao.selectAccountId(accountB);
		// 进行判断,成功后执行转账并写入日志
		if (account1.getAccount_money() < accountA.getAccount_money()) {
			// 账户余额不足
			return -1;
		} else if (account2 == null) {
			// 对方账户不存在 
			return -2;
		} else { // 条件都符合
			try {
				// 开启事务
				JdbcUtils.beginTranscation();
				// 从该账户中取出钱
				rows += accountdao.transferAccounts(accountA);
				// 转到对方账户
				rows += accountdao.saveMoney(accountB);
				// 将取出钱添加到日志文件
				rows += accountdao.accountLog(accountlog);
				// 提交事务
				JdbcUtils.commitTranscation();
			} catch (Exception e) {
				try {
					JdbcUtils.rollbackTranscation();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			return rows;
		}
	}

	/* (non-Javadoc)
	 * @see com.life.service.IAccountService#IncomeSum(com.life.po.AccountLog)
	 * 查询当月收入\支出的总金额
	 */
	@Override
	public BigDecimal statistics(AccountLog accountlog) {
		
		return accountdao.statistics(accountlog);
	}

}
