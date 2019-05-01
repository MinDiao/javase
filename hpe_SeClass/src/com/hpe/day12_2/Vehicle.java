package com.hpe.day12_2;
/*
 * 创建一个名称为Vehicle的接口，在接口中添加两个无参的方法start()和stop()。
 * 在两个名称分别为Bike和Bus的类中实现Vehicle接口。
 * 创建一个名称为interfaceDemo的类,在interfaceDemo的main()方法中
 * 使用多态的方式创建Bike和Bus对象并访问其start()和stop()方法。
 */
public interface Vehicle {
	public abstract void start();
	public abstract void stop();
}
