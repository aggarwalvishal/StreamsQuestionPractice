package com.vishal.practise.stream;

import java.util.Arrays;

/**
 * Remove duplicates from the string and return in the same order
 */
public class Question2 {

	public static void main(String[] args) {
		String s = "dabcadefg";
		
		Arrays.stream(s.split("")).distinct().forEach(System.out::print);

	}

}
