package com.hpe.day13;
//如果当前类中有引用数据类型的属性，则浅拷贝失败
public class Clone implements Cloneable {//实现接口，使克隆合法
	int number = 0;
	Clone2 obt2;
	public Clone() {
		obt2 = new Clone2();
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		/*return super.clone();*/
		//深拷贝
		Clone temp = (Clone)super.clone();
		temp.obt2 = (Clone2)obt2.clone();
		return temp;
	}
	
}
