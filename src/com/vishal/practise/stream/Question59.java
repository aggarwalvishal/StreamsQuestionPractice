package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 59. Convert List of string into map of String and its equivalent length.
 */
public class Question59 {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("orange", "banana", "kiwi");

		Map<String, Integer> convertToMap = fruits.stream()
				.collect(Collectors.toMap(f -> f, String::length, (existing, duplicate) -> existing));

		System.out.println(convertToMap);

	}

}
