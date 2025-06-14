package com.vishal.practise.stream;

import java.util.Arrays;

/**
 * Given a sentence, find the words with a specified number of vowels
 */
public class Question6 {

	public static void main(String[] args) {
		String s = "I am learning Streams API in Java";

		Arrays.stream(s.split(" ")).filter(x -> x.replaceAll("[^aieouAEIOU]", "").length() == 2)
				.forEach(System.out::println);

	}

}
