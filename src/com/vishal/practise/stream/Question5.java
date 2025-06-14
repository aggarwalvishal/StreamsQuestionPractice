package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a sentence, find the occurrence of each word
 */
public class Question5 {

	public static void main(String[] args) {
		String s = "I am learning Streams API in Java Java";

		Map<String, Long> wordOccurence = Arrays.stream(s.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(wordOccurence);

	}

}
