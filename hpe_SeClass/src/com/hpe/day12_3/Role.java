package com.hpe.day12_3;
/*
 * 	1定义一个抽象类Role，有姓名、年龄、性别等成员变量，要求：
		尽可能隐藏所有变量，再通过GetXXX()和SetXXX()方法对各变量进行读写；
		至少定义两个构造方法（一个无参的构造方法，一个有参的构造方法，有参的构造方法需要显示调用无参的构造方法）；
		Role类中要体现出this的几种用法。 
		具有一个抽象的无返回值的play()方法；
		具有一个普通的say()方法；
		提供一个final sing()方法。
		各方法中适当地添加打印语句，标识出所在类和所在方法即可。

	2从Role类派生出Employee类，要求：
		增加一个final成员变量id 
		增加一个静态成员变量company；
		增加了普通成员变量salary；
		通过GetXXX()和SetXXX()方法对新增加的变量进行读写；
		要有至少两个构造方法（一个构造方法只有一个参数id并调用父类无参的构造方法，另一个构造方法有多个属性值做参数并调用父类有参的构造方法）；
		要体现出this和super的用法；
		要覆盖play()方法，并在play方法中调用父类的say()方法；
		各方法中适当地添加打印语句，标识出所在类和所在方法即可。

	3在Test类的main()方法中：
		为Employee中的company赋值；
		调用Employee的两个构造方法实例化两个对象e1和e2
		分别打印e1和e2的属性信息
		调用e1的play方法
		调用e1的sing方法
 */
public abstract class Role {
	private String name;
	private int age;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	public Role() {
		this.name = "001";
	}
	public Role(String name) {
		this.name = name;
	}
	public Role(String name, int age, String sex) {
		this(name);
		this.age = age;
		this.sex = sex;
	}
	
	
	public abstract void play();
	
	public void say() {
		System.out.println("Role说话");
	}
	
	public final void sing() {
		System.out.println("Role唱歌");
	}
}
