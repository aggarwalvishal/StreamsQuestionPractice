package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 24 Convert a list of integers to a list of their squares
 */
public class Question24 {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		
		List<Integer> s = num.stream().map(i->i*i).collect(Collectors.toList());
		
		System.out.println(s);

	}

}
