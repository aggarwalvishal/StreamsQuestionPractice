package com.vishal.streamapi.practices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Given a sentence, find the occurrence of each word
 */
public class Question5 {

	public static void main(String[] args) {
		String s = "I am learning Streams API in Java Java";

		Map<String, Long> occurenceMap = Arrays.stream(s.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(occurenceMap);

	}

}
