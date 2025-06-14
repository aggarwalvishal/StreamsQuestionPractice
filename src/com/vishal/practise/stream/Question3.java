package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Find the word that has the second highest length
 */
public class Question3 {

	public static void main(String[] args) {
		String s = "I am learning Streams API in Java";

		String secondHighest = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed())
				.skip(1).findFirst().get();
		
		System.out.println(secondHighest);

	}

}
