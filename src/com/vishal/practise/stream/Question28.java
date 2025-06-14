package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 28 Remove all non-numeric characters from a list.
 */
public class Question28 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a1b2c3","1a2b3c","123abc");
		
		Pattern pattern = Pattern.compile("[^0-9]");
		
		List<String> nonNumeric = list.stream().map(x->pattern.matcher(x).replaceAll("")).collect(Collectors.toList());
		
		System.out.println(nonNumeric);

	}

}
