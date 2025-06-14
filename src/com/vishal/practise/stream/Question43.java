package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Difference between map and flatmap
 */
public class Question43 {

	public static void main(String[] args) {
		List<Person43> personList = Arrays.asList(new Person43("Alice", Arrays.asList("red", "blue")),
				new Person43("Bob", Arrays.asList("green")),
				new Person43("Charlie", Arrays.asList("yellow", "pink", "purple")));

		List<List<String>> colorList = personList.stream().map(Person43::getColors).collect(Collectors.toList());

		System.out.println(colorList);

		List<String> colorListFlatten = personList.stream().flatMap(p -> p.getColors().stream())
				.collect(Collectors.toList());
		
		System.out.println(colorListFlatten);

	}

}
