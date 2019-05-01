/**
 * 
 */
package com.zw.service;

import java.util.List;

import com.zw.po.User;

/** 
 * 	类描述：用户接口
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月6日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public interface IUserService {
	
	/**
	 * 
	 * 	方法描述：用户登录
	 * 	@param user 用户实体类
	 * 	@return 用户实体类
	 */
	User userLogin(User user);
	
	/**
	 * 
	 * 	方法描述：更具用户名查询
	 * 	@param user 用户信息
	 * 	@return 影响行数
	 */
	int Register(User user);
	
	/**
	 * 
	 * 	方法描述：根据用户输入的新密码修改当前登录用户的密码
	 * 	@param user
	 * 	@param newPassword
	 * 	@return
	 */
	int updatePassword(User user, String newPassword);
	
	/**
	 * 
	 * 	方法描述：查询所有用户
	 * 	@return
	 */
	List<User> selectAllUser();

}
