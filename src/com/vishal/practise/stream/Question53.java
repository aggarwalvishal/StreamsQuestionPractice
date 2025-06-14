package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a person object where each person has a first name and last name. Sort
 * the List<Pesron53> by there first name then last name.
 */
public class Question53 {

	public static void main(String[] args) {
		Person53 p1 = new Person53("Bobby", "Smith");
		Person53 p2 = new Person53("Bobby", "Adams");
		Person53 p3 = new Person53("John", "Smith");
		Person53 p4 = new Person53("Alice", "Johnson");

		List<Person53> personList = Arrays.asList(p1, p2, p3, p4);

		List<Person53> sort = personList.stream()
				.sorted(Comparator.comparing(Person53::getFirstName).thenComparing(Person53::getLastName))
				.collect(Collectors.toList());

		System.out.println(sort);

	}

}
