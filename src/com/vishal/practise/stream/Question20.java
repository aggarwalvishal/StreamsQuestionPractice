package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 20 In a given array of integers, return true if it contains distinct values
 */
public class Question20 {

	public static void main(String[] args) {
		int[] arr = {5,0,1,0,8,0};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		boolean isDistinict = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.values().stream().noneMatch(i->i>1);
		
		System.out.println(isDistinict);

	}

}
