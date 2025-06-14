package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 37. Transform Person object stream into a single string
 */
public class Question37 {

	public static void main(String[] args) {
		List<Person37> personList = Arrays.asList(new Person37("Max", 18), new Person37("Peter", 23),
				new Person37("Pamela", 24), new Person37("David", 28), new Person37("Dan", 30));

		Collector<Person37, StringJoiner, String> joiner = Collector.of(() -> new StringJoiner(" | "),
				(j, p) -> j.add(p.name.toString().toUpperCase()), 
				(j1, j2) -> j1.merge(j2),
				StringJoiner::toString);
		
		String n1 =personList.stream().collect(joiner);
		
		System.out.println(n1);

		List<String> names = personList.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		//System.out.println(names);

	}

}
