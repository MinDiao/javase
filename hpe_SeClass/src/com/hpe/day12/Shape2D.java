package com.hpe.day12;
/*
 * 	使用接口求图形的周长与面积
	创建接口Shape2D，其中定义常量PI为3.14并定义周长与面积的计算方法grith()和area()
	创建Cricle类实现接口Shape2D，重写其中的方法
	创建Rectangle类实现接口Shape2D，重写其中的方法
	创建InterfaceExample主类实现图形的周长、面积的计算并在控制台输入
 */
public interface Shape2D {
	public static final double PI = 3.14;
	
	//周长
	public abstract void grith();
	
	//面积
	public abstract void area();
}
