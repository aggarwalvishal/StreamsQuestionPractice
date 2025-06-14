package com.vishal.streamapi.practices;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given a sentence, find the word that has the 2nd (nth) highest
 */
public class Question3 {

	public static void main(String[] args) {
		String s = "I am learning Streams API in JAVA";

		String newStr = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1)
				.findFirst().get();

		System.out.println(newStr);
	}

}
