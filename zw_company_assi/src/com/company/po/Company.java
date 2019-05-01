/**
 * 
 */
package com.company.po;

/** 
 * 	类描述：实体类
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月4日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class Company {
	
	//员工id
	private int EmpID;
	
	//员工姓名
	private String EmpName;
	
	//部门id
	private int deptId;
	
	//员工入职时间
	private String EmpBirthday;
	
	//员工联系方式
	private String Empphone;
	
	//部门姓名
	private String deptName;
	
	/**
	 * 
	 */
	public Company() {
		
	}
	
	/**
	 * @param empID
	 * @param empName
	 * @param deptId
	 * @param empBirthday
	 * @param empphone
	 */
	public Company(int empID, String empName, int deptId, String empBirthday, String empphone) {
		EmpID = empID;
		EmpName = empName;
		this.deptId = deptId;
		EmpBirthday = empBirthday;
		Empphone = empphone;
	}

	/**	实体类重载，增加功能，建议还是另外创建一个实体类更好
	 * @param empID
	 * @param empName
	 * @param deptId
	 * @param empBirthday
	 * @param empphone
	 * @param deptName
	 */
	public Company(int empID, String empName, int deptId, String empBirthday, String empphone, String deptName) {
		EmpID = empID;
		EmpName = empName;
		this.deptId = deptId;
		EmpBirthday = empBirthday;
		Empphone = empphone;
		this.deptName = deptName;
	}
	/**
	 * @return the empID
	 */
	public int getEmpID() {
		return EmpID;
	}
	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return EmpName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	/**
	 * @return the deptId
	 */
	public int getDeptId() {
		return deptId;
	}
	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	/**
	 * @return the empBirthday
	 */
	public String getEmpBirthday() {
		return EmpBirthday;
	}
	/**
	 * @param empBirthday the empBirthday to set
	 */
	public void setEmpBirthday(String empBirthday) {
		EmpBirthday = empBirthday;
	}
	/**
	 * @return the empphone
	 */
	public String getEmpphone() {
		return Empphone;
	}
	/**
	 * @param empphone the empphone to set
	 */
	public void setEmpphone(String empphone) {
		Empphone = empphone;
	}
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [EmpID=" + EmpID + ", EmpName=" + EmpName + ", deptId=" + deptId + ", EmpBirthday="
				+ EmpBirthday + ", Empphone=" + Empphone + ", deptName=" + deptName + "]";
	}
	
}
