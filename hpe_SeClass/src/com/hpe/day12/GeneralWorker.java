package com.hpe.day12;

public class GeneralWorker extends Worker {
	
	public GeneralWorker(String name, int id, double salary) {
		super(name, id, salary);
	}
	@Override
	public void working() {
		System.out.println("姓名："+ name + "，工号"+ id + "，薪水"+ salary +"，看大门");
	}
	
}
