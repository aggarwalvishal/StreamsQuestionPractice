package com.vishal.practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOccurenceWithoutSpace {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[] newArr = Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
		Arrays.stream(newArr).forEach(System.out::println);
		
		System.out.println("==================================================");

		String demo = "I am learning Streams API in Java";

		String maxLength = Arrays.stream(demo.split(" ")).max(Comparator.comparing(String::length)).get();
		System.out.println(maxLength);
			
		// System.out.println(newArr.toString());
		/*
		 * String[] words = { "apple", "bannna", "apple", "grapes", "bannna", "apple",
		 * "orange" }; Map<String, Long> countMap = Arrays.stream(words).map(s -> s)
		 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		 * .entrySet().stream()
		 * .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		 * .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		 * System.out.println(countMap);
		 */

		// countMap.forEach((word, count)-> System.out.println(word +" : "+count));
	}
}
