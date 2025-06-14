package com.vishal.streamapi.practices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeOperation {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
	            new Employee("Alice", 30, 50000),
	            new Employee("Bob", 25, 15000),
	            new Employee("Alice", 28, 52000),
	            new Employee("Charlie", 35, 60000),
	            new Employee("Bob", 22, 41000),
	            new Employee("David", 40, 18000)
	        );

	        // Filter employees with salary > 20000
	        List<Employee> filtered = employees.stream()
	            .filter(emp -> emp.getSal() > 10000)
	            .collect(Collectors.toList());

	        // Find duplicate names among filtered employees
	        Set<String> duplicates = filtered.stream()
	            .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
	            .entrySet().stream()
	            .filter(e -> e.getValue() > 1)
	            .map(Map.Entry::getKey)
	            .collect(Collectors.toSet());

	        System.out.println("Duplicate employee names with salary > 20000: " + duplicates);

	        // Optionally, get employees with duplicate names and salary > 20000
	        List<Employee> duplicateEmployees = filtered.stream()
	            .filter(emp -> duplicates.contains(emp.getName())).sorted(Comparator.comparing(Employee::getName))
	            .collect(Collectors.toList());

	        System.out.println("Employees with duplicate names and salary > 20000: " + duplicateEmployees);

	}

}
