package com.vishal.practise.stream;

public class Employee {

	String name;
	String dept;
	int age;
	double sal;

	public Employee(String name, int age,String dept, double sal) {
		super();
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", age=" + age + ", sal=" + sal + "]";
	}

}
