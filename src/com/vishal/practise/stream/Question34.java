package com.vishal.practise.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 34. Find the occurrence of domains using Java streams
 */
public class Question34 {

	public static void main(String[] args) {
		Employee34 e1 = new Employee34("Vishal", "vishal123@gmail.com");
		Employee34 e2 = new Employee34("Ankit", "ankit123@yahoo.com");
		Employee34 e3 = new Employee34("Vikas", "vikasl123@gmail.com");

		List<Employee34> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

		//System.out.println(empList);

		
		Map<String, List<String>> occurence = empList.stream().map(e -> e.getEmail().substring(e.getEmail().indexOf('@')))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.toList()));
		System.out.println(occurence);

	}

}
