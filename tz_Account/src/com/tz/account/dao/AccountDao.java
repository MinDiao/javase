/**
 * 
 */
package com.tz.account.dao;

import org.apache.commons.dbutils.QueryRunner;

import com.tz.account.po.Account;
import com.tz.account.utils.JDBCUtils;

/** 
 * 	类描述：数据访问层
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月3日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class AccountDao {
	
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	
	public void addAccount(Account account) {
		
		try {
			//sql
			String sql = "insert into account(name, money, accounting, createtime, description) values(?,?,?,?,?)";
			//创建对象数组,用来填充占位符
			Object[] param = {account.getName(), account.getMoney(), account.getAccounting(), account.getCreatetime(), account.getDescription()};
			//使用query实例调用更新方法
			qr.update(sql, param);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
