package com.hpe.day07;
/*
 * 	定义一个表示学生信息的类Student要求如下：
	类Student的成员变量：sNO表示学号；sName表示姓名；sSex表示性别；sAge表示年龄；sJava：表示Java课程成绩。
	类Student带参数的构造方法：在构造方法中通过形参完成对成员变量的赋值操作。
	类Student的方法成员：getNo（）：获得学号；getName（）：获得姓名；getSex（）：获得性别；getAge（）获得年龄；
		getJava（）：获得Java 课程成绩
	根据类Student的定义，创建五个该类的对象，输出每个学生的信息，计算并输出这五个学生Java语言成绩的平均值，
		以及计算并输出他们Java语言成绩的最大值和最小值。
 */
public class Student {
	private int sNO;
	private String sName;
	private String sSex;
	private int sAge;
	private double sJava;
	public Student() {
		super();
	}
	public Student(int sNO, String sName, String sSex, int sAge, double d) {
		super();
		this.sNO = sNO;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = d;
	}
	public int getsNO() {
		return sNO;
	}
	public void setsNO(int sNO) {
		this.sNO = sNO;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsSex() {
		return sSex;
	}
	public void setsSex(String sSex) {
		this.sSex = sSex;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public double getsJava() {
		return sJava;
	}
	public void setsJava(double sJava) {
		this.sJava = sJava;
	}
	@Override
	public String toString() {
		return "Student [sNO=" + sNO + ", sName=" + sName + ", sSex=" + sSex + ", sAge=" + sAge + ", sJava=" + sJava
				+ "]";
	}
	
	
	
	/*public void show() {
		System.out.println("学号:"+sNO+",姓名:"+sName+",性别:"+sSex+",年龄:"+sAge+",java成绩:"+sJava+"分");
	}*/
	//平均值
	/*public void Average() {
		double result = 0;
		result += this.getsJava();
		System.out.println("平均值："+ result / this.getsSex().length());
	}*/
	//最大值最小值
	/*public void MaxMin() {
		double max = 0;
		double min = 0;
		double[] arr = new double[this.getsSex().length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = this.getsJava();
			if (arr[i] > min) {
				max = arr[i];
			} else if (arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		for (double d : arr) {
			System.out.println(d);
		}
	}*/
}
