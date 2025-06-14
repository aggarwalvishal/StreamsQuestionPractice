package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 38. Group list of strings by their first character and count the number of
 * strings
 */
public class Question38 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("apple", "banana", "apricot", "cherry", "blueberry", "avocado");

		Map<Character, Long> occurenceMap = names.stream()
				.collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.counting()));
		
		System.out.println(occurenceMap);
	}

}
