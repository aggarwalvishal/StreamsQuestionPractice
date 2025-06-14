package com.vishal.practise.stream;

import java.util.Comparator;

/**
 * 61. Find the upper case character and reverse the order.
 */
public class Question61 {

	public static void main(String[] args) {
		String s = "HelloWorldHelloWOrlD";

		s.chars().mapToObj(c -> (char) c).filter(c -> Character.isUpperCase(c)).sorted(Comparator.reverseOrder())
				.forEach(System.out::print);

	}

}
