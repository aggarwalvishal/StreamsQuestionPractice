package com.vishal.practise.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a word, find the occurrence of each character
 */
public class Question8 {

	public static void main(String[] args) {
		String s = "Mississippi mis mis";

		Map<Character, Long> charOccurence = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(charOccurence);

	}

}
