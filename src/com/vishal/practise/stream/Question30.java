package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 30 Convert a list of strings to uppercase. 
 */
public class Question30 {

	public static void main(String[] args) {
		List<String> s = Arrays.asList("breaking bad","game of throne","big bang theory");
		
		List<String> upperCaseList = s.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(upperCaseList);

	}

}
