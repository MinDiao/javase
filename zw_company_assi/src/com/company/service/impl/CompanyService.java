/**
 * 
 */
package com.company.service.impl;

import java.util.List;

import com.company.dao.impl.CompanyDaoImpl;
import com.company.po.Company;

/** 
 * 	类描述：业务逻辑层,对数据进行加工,包装
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月4日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class CompanyService {
	
	//实例化数据访问层
	CompanyDaoImpl companydaoimpl = new CompanyDaoImpl();
	
	//查询所有信息
	public List<Company> selectAll(){
		
		return companydaoimpl.selectAll();
		
	}
	
	//指定姓名查询单个员工信息
	public Company selectName(String name) {
		
		return companydaoimpl.selectName(name);
		
	}
	
	//添加员工
	public int add(Company company) {
		
		if (selectName(company.getEmpName()) != null) {
			return 0;
		} else {
			return companydaoimpl.add(company);
		}
		
	}
	
	//指定姓名修改电话本
	public int update(Company company, String name) {
		
		return companydaoimpl.update(company, name);
		
	}
	
	//指定姓名删除员工信息
	public int delete(String name) {
		
		if (name.equals(selectName(name).getEmpName())) {
			return companydaoimpl.delete(name);
		} else {
			return 0;
		}
		
	}
	
}
