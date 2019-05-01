/**
 * 
 */
package com.zw.service;

import com.zw.po.Admin;

/** 
 * 	类描述：管理员业务逻辑层
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月5日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public interface IAdminService {
	
	/**
	 * 
	 * 	方法描述：管理员登录
	 * 	@param admin
	 * 	@return 管理员信息
	 */
	Admin login(Admin admin);
	
	

}
