package com.hpe.day12;

public class Manager extends Worker {
	
	double bonus;
	public Manager(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}
	@Override
	public void working() {
		System.out.println("姓名："+ name +"，工号"+ id +"，薪水"+ salary +"，奖金"+ bonus +"，管理人员");
	}

}
