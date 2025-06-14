package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 45. Given a person list, fetch the list of names of a Person 
 * 1. Whose age is greater than 30 
 * 2. name should be unique. 
 * 3. names should be in sorted order
 */
public class Question45 {

	public static void main(String[] args) {
		// This is a bad practice
		List<Person45> personList = Arrays.asList(new Person45("Rahul", 39), new Person45("Ankit", 39),
				new Person45("Adhil", 23), new Person45("Ankit", 39), new Person45("Krishna", 32));

		List<String> greaterThan30 = personList.stream().filter(p -> p.getAge() > 30).map(Person45::getName).distinct()
				.sorted().collect(Collectors.toList());

		System.out.println(greaterThan30);

		// Good Practice

		List<String> filterList = personList.stream().filter(p -> p.getAge() > 30).map(Person45::getName)
				.collect(Collectors.toList());
		
		List<String> uniqueSortedName = filterList.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(filterList);
		System.out.println(uniqueSortedName);

	}

}
