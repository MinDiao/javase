package com.hpe.day09;
/*
 * 	编写一个圆类Circle，该类拥有：  
	一个成员变量：
	Radius（私有，浮点型）；  // 存放圆的半径；        
	两个构造方法：
	Circle( )
	Circle(double  r )  //创建Circle对象时将半径初始化为r        
		三个成员方法：
	double getArea( )       //获取圆的面积
	double getPerimeter( )   //获取圆的周长              
	void  show( )          //将圆的半径、周长、面积输出到屏幕 
	
		编写一个圆柱体类Cylinder，它继承于上面的Circle类。还拥有：  
		一个成员变量：  
	double hight（私有，浮点型）；  // 圆柱体的高；         
		构造方法：            
	Cylinder (double r, double  h )   //创建Circle对象时将半径初始化为r         
		成员方法：
	double getVolume( )             //获取圆柱体的体积
	void  showVolume( )             //将圆柱体的体积输出到屏幕
	编写应用程序，创建类的对象，分别设置圆的半径、圆柱体的高，计算并分别显示圆半径、圆面积、
	圆周长，圆柱体的体积
 */
public class Circle {
	//成员变量
	private double radius;
	//settergetter
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	//构造方法
	/*public Circle() {
		
	}*/
	public Circle(double r) {
		this.setRadius(r);
	}
	//成员方法：
	//获取圆的面积
	public double getArea() {
		return Math.PI * Math.sqrt(this.getRadius());
	}
	//获取圆的周长
	public double getPerimeter() {
		return Math.PI * (this.getRadius() * 2);
	}
	//将圆的半径、周长、面积输出到屏幕 
	public void show() {
		//输出圆的半径
		System.out.println("圆的半径"+ this.getRadius());
		//输出圆的面积
		System.out.println("圆的面积"+ this.getArea());
		//输出圆的周长
		System.out.println("圆的周长"+ this.getPerimeter());
	}
}
