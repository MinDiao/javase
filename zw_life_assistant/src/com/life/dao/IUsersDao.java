/**
 * 
 */
package com.life.dao;

import com.life.po.Account;
import com.life.po.Users;

/** 
 * 	类描述：用户接口
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月10日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public interface IUsersDao {
	
	/**
	 * 
	 * 	方法描述：用户登录接口
	 * 	@param users 用户名，密码
	 * 	@return 用户实体类,查询结果
	 */
	public Users login(Users users);
	
	/**
	 * 
	 * 	方法描述：根据用户姓名查询接口
	 * 	@param name 用户姓名
	 * 	@return 用户实体类,查询结果
	 */
	public Users selectUsersName(String name);
	
	/**
	 * 
	 * 	方法描述：注册\添加用户
	 * 	@param users 用户实体类
	 * 	@return 执行结果\影响行数
	 */
	public int insertUsers(Users users);
	
	/**
	 * 
	 * 	方法描述：根据注册好的用户id创建相应的银行id
	 * 	@param users 注册号的用户id
	 * 	@return 影响行数
	 */
	public int insertAccount(Account account);
	
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
