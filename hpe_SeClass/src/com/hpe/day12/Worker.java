package com.hpe.day12;

public abstract class Worker {
	public abstract void working();
	String name;
	int id;
	double salary;
	public Worker(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
}
