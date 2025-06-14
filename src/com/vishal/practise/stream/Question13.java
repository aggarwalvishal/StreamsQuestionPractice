package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 13 Given an array of integers, group the numbers by the range
 */
public class Question13 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 10, 14, 20, 24, 30, 34, 40, 44, 50, 54 };

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		Map<Integer, List<Integer>> rangeList = list.stream()
				.collect(Collectors.groupingBy(x -> x / 10 * 10, LinkedHashMap::new,Collectors.toList()));
		
		System.out.println(rangeList);

	}

}
