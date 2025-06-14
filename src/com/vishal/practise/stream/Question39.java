package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 39. Convert a list to a map
 */
public class Question39 {

	public static void main(String[] args) {
		List<Person39> personList = Arrays.asList(new Person39("India", 18), new Person39("England", 23),
				new Person39("New York", 24), new Person39("London", 28), new Person39("London", 30));

		Map<String, List<Person39>> convertMap = personList.stream()
				.collect(Collectors.groupingBy(Person39::getCity, Collectors.toList()));

		System.out.println(convertMap);

	}

}
