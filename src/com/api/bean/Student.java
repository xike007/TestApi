package com.api.bean;

public class Student extends Person {

	public Student() {
		super();
	}

	public Student(String name, Integer age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return "Student:" + getName() + ":" + getAge();
	}

	
}
