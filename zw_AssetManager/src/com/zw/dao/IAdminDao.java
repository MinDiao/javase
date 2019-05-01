/**
 * 
 */
package com.zw.dao;

import com.zw.po.Admin;

/** 
 * 类描述：数据库访问层管理员登录接口
 * 作者： LiuJinrong 
 * 创建日期：2018年11月2日
 * 修改人：
 * 修改日期：
 * 修改内容：
 * 版本号： 1.0.0   
 */
public interface IAdminDao {
	
	/**
	 * 
	 * 方法描述：管理员登录
	 * @param admin 管理员实体(用户名和密码)
	 * @return admin对象
	 */
	Admin login(Admin admin);
	
}
