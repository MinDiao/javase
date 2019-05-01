/**
 * 
 */
package com.zw.service.impl;

import com.zw.dao.IAdminDao;
import com.zw.dao.impl.AdminDaoImpl;
import com.zw.po.Admin;
import com.zw.service.IAdminService;

/** 
 * 类描述：管理员业务逻辑层
 * 作者： LiuJinrong 
 * 创建日期：2018年11月2日
 * 修改人：
 * 修改日期：
 * 修改内容：
 * 版本号： 1.0.0   
 */
public class AdminServiceImpl implements IAdminService {

	//多态:实际调用的是接口实现类的属性(父类调用的是子类重写的方法,更安全)
	private IAdminDao admindao = new AdminDaoImpl();
		
	@Override
	public Admin login(Admin admin) {
		
		return admindao.login(admin);
	}
	
}




	