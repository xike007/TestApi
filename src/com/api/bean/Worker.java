package com.api.bean;

public class Worker extends Person {

	public Worker() {
		super();
	}

	public Worker(String name, Integer age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return "Worker:" + getName() + ":" + getAge();
	}

	
}
