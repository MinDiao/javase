/**
 * 
 */
package com.zw.service.impl;

import java.util.List;

import com.zw.dao.IUserDao;
import com.zw.dao.impl.UserDaoImpl;
import com.zw.po.User;
import com.zw.service.IUserService;

/** 
 * 	类描述：
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月6日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class UserServiceImpl implements IUserService {
	
	private IUserDao userDao = new UserDaoImpl();

	/* (non-Javadoc)
	 * @see com.zw.service.IUserService#userLogin(com.zw.po.User)
	 */
	@Override
	public User userLogin(User user) {
		
		return userDao.userLogin(user);
	}

	/* (non-Javadoc)
	 * @see com.zw.service.IUserService#Register(com.zw.po.User)
	 * 根据用户名查询
	 */
	@Override
	public int Register(User user) {
		
		User users = userDao.selectUserName(user.getUserName());
		if (users != null) {
			return -1;//用户名已存在
		} else {
			Long result = userDao.register(user);
			return result.intValue();//将封装类转换成基本数据类型
		}
		
	}

	/* (non-Javadoc)
	 * @see com.zw.service.IUserService#updatePassword(com.zw.po.User, java.lang.String)
	 * 	根据用户输入的新密码修改当前登录用户的密码
	 */
	@Override
	public int updatePassword(User user, String newPassword) {

		return userDao.updatePassword(user, newPassword);
		
	}

	/* (non-Javadoc)
	 * @see com.zw.service.IUserService#selectAllUser()
	 */
	@Override
	public List<User> selectAllUser() {
		
		return userDao.selectAllUser();
		
	}

}
