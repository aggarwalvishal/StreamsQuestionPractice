package com.vishal.practise.stream;

import java.util.Comparator;

/**
 * Reverse the string
 */
public class Question32 {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		s.chars().mapToObj(c->(char)c).map(c->Character.toLowerCase(c)).sorted(Comparator.reverseOrder()).forEach(System.out::print);

	}

}
