package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 52. Print all employees with salary greater than 20000 and increase their
 * salary by 1000.
 */
public class Question52 {

	public static void main(String[] args) {
		Employee52 e1 = new Employee52("Vishal", 21000.0);
		Employee52 e2 = new Employee52("Ankit", 25000.0);
		Employee52 e3 = new Employee52("Vikas", 19000.0);
		Employee52 e4 = new Employee52("Sandesh", 18000.0);
		
		List<Employee52> empList = Arrays.asList(e1,e2,e3,e4);
		
		List<Employee52> filterList = empList.stream().filter(emp->emp.getSalary()>20000).map(emp->{
			double sal = emp.getSalary()+1000.0;
			emp.setSalary(sal);
			return emp;
		}).collect(Collectors.toList());
		
		System.out.println(filterList);
	}

}
