package com.vishal.streamapi.practices;

public class Employee {
	private String name;
	private int age;
	private double sal;

	public Employee(String name, int age, double sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSal() {
		return sal;
	}

	@Override
	public String toString() {
		return "Employee{name='" + name + "', age=" + age + ", sal=" + sal + '}';
	}
}
