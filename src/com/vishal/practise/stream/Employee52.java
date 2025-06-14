package com.vishal.practise.stream;

public class Employee52 {

	String name;
	double salary;
	/**
	 * @param name
	 * @param salary
	 */
	public Employee52(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee52 [name=" + name + ", salary=" + salary + "]";
	}
	
}
