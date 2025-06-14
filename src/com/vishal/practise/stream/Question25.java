package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 25 Find and print the distinct odd numbers
 */
public class Question25 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,8,9,9,10);
		
		List<Integer> oddList = list.stream().distinct().filter(i->i%2!=0).collect(Collectors.toList());
		
		System.out.println(oddList);

	}

}
