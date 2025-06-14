package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 35 Convert list of integers to a list of their squares
 */
public class Question36 {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		
		List<Integer> squareList = num.stream().map(i->i*i).collect(Collectors.toList());
		
		System.out.println(squareList);

	}

}
