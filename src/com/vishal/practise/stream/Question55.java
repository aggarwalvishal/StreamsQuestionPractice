package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Given a list of employees with their names and department names, write a
 * stream API solution to find the department that has the maximum number of
 * employees.
 */
public class Question55 {

	public static void main(String[] args) {
		List<Emplyee55> empList = Arrays.asList(new Emplyee55("Alice", "HR"), new Emplyee55("Bob", "IT"),
				new Emplyee55("Charlie", "IT"), new Emplyee55("David", "Finance"), new Emplyee55("Eve", "IT"),
				new Emplyee55("Frank", "HR"), new Emplyee55("Grace", "Finance"), new Emplyee55("Hannah", "IT"));

		Optional<Map.Entry<String, Long>> noOfEmp = empList.stream()
				.collect(Collectors.groupingBy(Emplyee55::getDepartment, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue());
		
		System.out.println(noOfEmp.get().getValue());

	}

}
