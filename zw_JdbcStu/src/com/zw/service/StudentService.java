package com.zw.service;

import java.util.List;
import com.zw.dao.StudentDao;
import com.zw.po.Student;

/*
 * 业务逻辑访问层:进行业务处理,数据加工,依赖于数据访问层
 */
public class StudentService {
	
	StudentDao studentDao = new StudentDao();
	//查询所有学生信息
	public List<Student> getStudentAll(){
		return studentDao.getStudentAll();
	}
	
}
