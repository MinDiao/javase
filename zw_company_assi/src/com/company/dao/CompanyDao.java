/**
 * 
 */
package com.company.dao;

import java.util.List;

import com.company.po.Company;

/** 
 * 	类描述：数据访问层接口
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月4日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public interface CompanyDao {
	
	//查询所有
	public List<?> selectAll();
	
	//按姓名查询
	public Company selectName(String name);
	
	//增
	public int add(Company company);
	
	//改
	public int update(Company company, String name);
	
	//删
	public int delete(String name); 

}
