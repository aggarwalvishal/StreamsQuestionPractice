package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 26 Find the union of two lists of integers
 */
public class Question26 {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,3,4,5);
		List<Integer> l2 = Arrays.asList(6,7,8,9,10);
		
		List<Integer> list = Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList());
		
		System.out.println(list);

	}

}
