/**
 * 
 */
package com.zw.dao;

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
public interface IUserDao {
	
	/**
	 * 
	 * 	方法描述：用户登录
	 * 	@param user 用户名和密码
	 * 	@return 用户信息
	 */
	User userLogin(User user);
	
	/**
	 * 
	 * 	方法描述：注册
	 * 	@param user 用户星系
	 * 	@return 执行的行数
	 */
	Long register(User user);
	
	/**
	 * 
	 * 	方法描述：根据用户名查询
	 * 	@param name 用户名
	 * 	@return 用户信息
	 */
	User selectUserName(String name);
	
	/**
	 * 
	 * 	方法描述：根据用户输入的新密码修改当前登录用户的密码
	 * 	@param asset
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
