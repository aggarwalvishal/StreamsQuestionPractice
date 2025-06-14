package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Find the 2nd highest length word in the given sentence
 */
public class Question4 {

	public static void main(String[] args) {
		String s = "I am learning Streams API in Java";

		int secondHigest = Arrays.stream(s.split(" ")).map(x -> x.length()).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();
		
		System.out.println(secondHigest);

	}

}
