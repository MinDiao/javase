package com.tel.service;

import java.util.List;

import com.tel.dao.PersonDao;
import com.tel.po.Person;

/*
 * 业务逻辑访问层:进行业务处理,数据加工,依赖于数据访问层
 */
public class PersonService {
	
	PersonDao personDao = new PersonDao();
	/*查询所有电话本信息*/
	public List<Person> getPersonAll(){
		return personDao.getPersonAll();
	}
	
	/*按指定姓名查询电话本*/
	public List<Person> getPersonNameDao(String selectName){
		return personDao.getPersonName(selectName);
	}
	
	/*添加信息*/
	public int addPersonDao(Person per) {
		if (personDao.getPersonName(per.getTname()) != null) {
			return 0;
		} 
		return personDao.addPerson(per);
	}
	
	/*修改信息*/
	public int updatePersonDao(Person per, String name) {
		return personDao.updatePerson(per,name);
	}
	
	/*删除信息*/
	public int deletePersonDao(String name) {
		return personDao.deletePerson(name);
	}
}
