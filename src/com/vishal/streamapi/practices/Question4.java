package com.vishal.streamapi.practices;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Find the 2nd highest length word in a sentence
 */
public class Question4 {

	public static void main(String[] args) {
		String s = "I am learning Streams API in Java";
		
		int secondHighest = Arrays.stream(s.split(" ")).map(s1->s1.length())
				.sorted(Comparator.reverseOrder())
				.skip(2).findFirst().get();
		System.out.println(secondHighest);

	}

}
