package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 56. Given a list of employees where each employee has a name, department and
 * salary. Write a stream API solution to calculate the average salary for each
 * department and display the result.
 */
public class Question56 {

	public static void main(String[] args) {
		List<Employee56> empList = Arrays.asList(new Employee56("Alice", "HR", 2000.0),
				new Employee56("Bob", "IT", 3000.0), new Employee56("Charlie", "IT", 4000.0),
				new Employee56("David", "Finance", 5000.0), new Employee56("Eve", "IT", 4500.0),
				new Employee56("Frank", "HR", 6000.0), new Employee56("Grace", "Finance", 7000.0),
				new Employee56("Hannah", "IT", 10000.0));

		Map<String, Double> calculateAvg = empList.stream().collect(
				Collectors.groupingBy(Employee56::getDepartment, Collectors.averagingDouble(Employee56::getSalary)));
		
		System.out.println(calculateAvg);
	}
	

}
