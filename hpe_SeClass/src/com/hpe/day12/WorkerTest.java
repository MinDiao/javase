package com.hpe.day12;

public class WorkerTest {

	public static void main(String[] args) {
		GeneralWorker gw = new GeneralWorker("张三",1,500);
		gw.working();
		
		Manager m = new Manager("李四",2,900,200);
		m.working();
	}

}
