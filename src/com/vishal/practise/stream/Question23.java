package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 23 Sort a list of strings in alphabetical order
 */
public class Question23 {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("Zudio","Puma","Addidas","MAC","H&M");
		
		List<String> sortedString = str.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedString);

	}

}
