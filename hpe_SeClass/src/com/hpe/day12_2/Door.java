package com.hpe.day12_2;
/*
 * 设计抽象类Door，它拥有所有门的共性方法open ()和close ()。
 * 设计防火接口FireSafe，该接口有一个抽象方法fireProof()。
 * 设计防弹接口BulletSafe，该接口有一个抽象方法bulletProof()。
 * 综合利用继承、抽象类、接口的知识设计出防火门FireProofDoor和
 * 防弹门BulletProofDoor两个类。设计Test类的main()方法，
 * 分别调用FireProofDoor和BulletProofDoor的所有方法。
 * （实现各方法时做简单的打印即可）
 */
public abstract class Door {
	public abstract void open();
	
	public abstract void close();
}
