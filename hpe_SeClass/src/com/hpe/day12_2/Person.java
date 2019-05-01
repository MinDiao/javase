package com.hpe.day12_2;
/*
 * 	【练习题】9.接口
	创建一个名称为Person的接口，在接口中添加两个方法eat()和sleep()。
	分别用学生类（在食堂吃饭，在宿舍住宿）、教师类（在教室食堂吃饭，在学校公寓住宿）
	和学生家长类（在招待所吃饭，在招待所住宿）来实现接口。并进行测试。
 */
public interface Person {
	public abstract void eat();
	
	public abstract void sleep();
}	
