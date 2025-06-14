package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 42. Convert a list of string to uppercase and then concatenate
 */
public class Question42 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","c","d");
		
		Optional<String> nList = list.stream().map(String::toUpperCase).reduce((a,b)-> a+" "+b);
		
		System.out.println(nList.get());

	}

}
