/**
 * 
 */
package com.life.service.impl;

import java.sql.SQLException;

import com.life.dao.IUsersDao;
import com.life.dao.impl.UsersDaoImpl;
import com.life.po.Account;
import com.life.po.Users;
import com.life.service.IUsersService;
import com.life.utils.JdbcUtils;

/** 
 * 	类描述：用户服务层实现类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月10日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class UsersServiceImpl implements IUsersService {
	
	// 实现IUserDao接口
	private static IUsersDao usersdao = new UsersDaoImpl();
	

	/* (non-Javadoc)
	 * @see com.life.service.IUserService#login(java.lang.String, java.lang.String)
	 * 用户登录
	 */
	@Override
	public Users login(Users users) {
		return usersdao.login(users);
	}

	/* (non-Javadoc)
	 * @see com.life.service.IUsersService#selectUsersName(java.lang.String)
	 * 根据用户姓名查询
	 
	@Override
	public Users selectUsersName(String name) {
		
		return null;
	}*/

	/* (non-Javadoc)
	 * @see com.life.service.IUsersService#insertUsers(com.life.po.Users)
	 * 添加\注册用户信息
	 */
	@Override
	public boolean insertUsers(Users users) {
		// 初始化执行结果
		boolean flag = false;
		// 初始化账户实体类
		Account account = null;
		// 判断是否存在同名用户
		Users users1 = usersdao.selectUsersName(users.getUserName());
		// 判断是否添加\注册成功
		if (users1 != null) {
			flag = false; // 有同名用户
		} else {
			// 无同名用户
			try {
				// 开启事务
				JdbcUtils.beginTranscation();
				// 执行注册用户信息功能
				usersdao.insertUsers(users);
				// 获取该用户的id
				Users users2 = usersdao.selectUsersName(users.getUserName());
				// 并将该用户的id属性赋值到实体类
				account = new Account(users2.getUserId());
				// 执行注册账户功能
				usersdao.insertAccount(account);
				// 提交事务
				JdbcUtils.commitTranscation();
				// 改变执行结果
				flag = true;
			} catch (Exception e) {
				try {
					// 回滚事务
					JdbcUtils.rollbackTranscation();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
		return flag;
	}
	
	/* (non-Javadoc)
	 * @see com.life.service.IUsersService#updateTelAddress(java.lang.String, java.lang.String, com.life.po.Users)
	 * 信息维护
	 */
	@Override
	public int updateTelAddress(Users users, String name) {
		
		return usersdao.updateTelAddress(users, name);
	}

	/* (non-Javadoc)
	 * @see com.life.service.IUsersService#updatePassword(com.life.po.Users, java.lang.String)
	 */
	@Override
	public int updatePassword(Users users, String name) {
		
		return usersdao.updatePassword(users, name);
	}
	
	

}
