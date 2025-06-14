package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Divide given integer list into lists of even and odd numbers
 */
public class Question7 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		List<List<Integer>> checkList = list.stream()
				.collect(Collectors.partitioningBy(x->x%2==0,Collectors.toList()))
				.entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
		System.out.println(checkList);

	}

}
