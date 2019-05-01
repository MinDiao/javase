package com.hpe.day13_Map;
/*实体类(模型M)：主要用来描述或存储一个人的相关信息*/
public class PeopleInfo {
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		if(sex.equals("男")||sex.equals("女")){
			this.sex = sex;
		}else{
			System.out.println("性别只能是'男'或'女'！");
		}
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		if(age>0 && age < 200){
			this.age = age;
		}else{
			System.out.println("年龄取值范围0<age<200!");
		}
	}
	/**
	 * @return the telNo
	 */
	public String getTelNo() {
		return telNo;
	}
	/**
	 * @param telNo the telNo to set
	 */
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	/**
	 * @return the qQ
	 */
	public String getQQ() {
		return QQ;
	}
	/**
	 * @param qQ the qQ to set
	 */
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	/**
	 * @return the dir
	 */
	public String getDir() {
		return dir;
	}
	/**
	 * @param dir the dir to set
	 */
	public void setDir(String dir) {
		this.dir = dir;
	}
	private String name;	//姓名
	private String sex;		//性别
	private int age;		//年龄
	private String telNo;	//电话
	private String QQ;		//QQ
	private String dir;		//地址
	
	public PeopleInfo(){
		
	}
	public PeopleInfo(String name, String sex, int age, String telNo, String qQ, String dir) {
		super();
		setAge(age);
		setDir(dir);
		setName(name);
		setQQ(qQ);
		setSex(sex);
		setTelNo(telNo);
	}
	// 返回该对象的所有信息
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "姓名=" + name + ", sex=" + sex + ", age=" + age + ", telNo=" + telNo + ", QQ=" + QQ
				+ ", dir=" + dir + "]";
	}	
}
