package com.vishal.practise.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 58. Given a string return the character with the maximum frequency in the String.
 */
public class Question58 {

	public static void main(String[] args) {
		String input = "javadeveloper";
		//String check = "e";
		
		Map.Entry<Character, Long> max = input.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		System.out.println(max.getKey()+"==>"+max.getValue());

	}

}
