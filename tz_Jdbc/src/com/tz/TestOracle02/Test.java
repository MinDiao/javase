package com.tz.TestOracle02;

import java.sql.SQLException;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmpDao dao = new EmpDao();
		Emp emp = new Emp();
		
		emp.setEmpno(0001);
		emp.setEname("悟空");
		emp.setJob("取经");
		emp.setSal(10000.0);
		emp.setDeptno(10);
		
		//增
		//dao.addEmp(emp);
		
		//删
		//dao.delEmp(1);
		
		//改
		//dao.updateEmp(emp);
		
		//查
		//dao.selEmp(7566);
	}
}
