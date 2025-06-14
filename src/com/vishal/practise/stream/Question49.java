package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 49. Given an employee object, print the average of the age of male and female
 * employee.
 */
public class Question49 {

	public static void main(String[] args) {

		Employee49 e1 = new Employee49("Anil", "anil@gmail.com", 24, "M");
		Employee49 e2 = new Employee49("Bob", "bob@gmail.com", 35, "M");
		Employee49 e3 = new Employee49("Cindy", "cindy@gmail.com", 33, "F");
		Employee49 e4 = new Employee49("Diana", "diana@gmail.com", 45, "F");

		List<Employee49> empList = Arrays.asList(e1, e2, e3, e4);

		Map<String, Double> map = empList.stream()
				.collect(Collectors.groupingBy(Employee49::getGender, Collectors.averagingDouble(Employee49::getAge)));
		System.out.println(map);
		
		double femaleAverageAge = empList.stream().filter(emp -> emp.getGender() == "F").mapToInt(Employee49::getAge)
				.average().getAsDouble();
		System.out.println(femaleAverageAge);

		double maleAvgAge = empList.stream().filter(emp -> emp.getGender() == "M").mapToInt(Employee49::getAge)
				.average().getAsDouble();

		System.out.println(maleAvgAge);
	}

}
