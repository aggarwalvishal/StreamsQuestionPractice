package com.vishal.streamapi.practices;

import java.util.Arrays;

/**
 * Remove duplicate from the string and return the same order
 */
public class Question2 {

	public static void main(String[] args) {
		String s ="dabcadefg";
		s.chars().distinct().mapToObj(c->(char)c).forEach(System.out::print);
		
		System.out.println("===========================================");
		
		Arrays.stream(s.split("")).distinct().forEach(System.out::print);

	}

}
