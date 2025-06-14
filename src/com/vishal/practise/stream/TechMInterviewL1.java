package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TechMInterviewL1 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
	            new Employee("Amiti", 30, "IT", 400000),
	            new Employee("Anjali", 28, "HR", 450000),
	            new Employee("Arti", 24, "IT", 500000),   // age not >25 → excluded
	            new Employee("Aadi", 35, "Sales", 360000),
	            new Employee("Ajayi", 26, "IT", 390000),
	            new Employee("Ami", 27, "HR", 330000)     // salary not >350000 → excluded
	        );

		List<Employee> filterList = employees.stream()
				.filter(e -> e.getName().startsWith("A") && e.getName().endsWith("i") && e.getAge() > 24)
				.collect(Collectors.toList());

		System.out.println(filterList);

		Map<String, Map<Double, List<Employee>>> finalMap = filterList.stream().filter(e -> e.getSal() > 35000)
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.groupingBy(Employee::getSal)));

		System.out.println(finalMap);

	}

}
