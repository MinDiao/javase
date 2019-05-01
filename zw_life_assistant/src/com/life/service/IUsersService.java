/**
 * 
 */
package com.life.service;

import com.life.po.Users;

/** 
 * 	类描述：用户服务层接口
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月10日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public interface IUsersService {
	
	/**
	 * 
	 * 	方法描述：用户登录
	 * 	@param userName 用户名
	 * 	@param userPassword 用户密码
	 * 	@return 用户实体类
	 */
	public Users login(Users users);
	
	/**
	 * 
	 * 	方法描述：根据用户姓名查询
	 * 	@param name 用户姓名
	 * 	@return 用户实体类
	 *//*
	public Users selectUsersName(String name);*/
	
	/**
	 * 
	 * 	方法描述：添加\注册用户信息
	 * 	@param users 用户实体类
	 * 	@return 影响行数
	 */
	public boolean insertUsers(Users users);
	
	/**
	 * 
	 * 	方法描述：信息维护
	 * 	@param tel 用户电话
	 * 	@param address 用户地址
	 * 	@param users 用户信息实体类
	 * 	@return 影响行数
	 */
	public int updateTelAddress(Users users, String name);
	
	/**
	 * 
	 * 	方法描述：密码修改
	 * 	@param users 用户信息实体类
	 * 	@param name 用户名
	 * 	@return 影响行数
	 */
	public int updatePassword(Users users, String name);

}
