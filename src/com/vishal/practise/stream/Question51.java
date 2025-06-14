package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 51. Print distinct numbers which starts with "1" in descending order
 */
public class Question51 {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 11, 34, 67, 121, 121, 52, 78, 114, 565, 1643, 11 };

		List<Integer> list = Arrays.stream(arr).distinct().filter(x -> String.valueOf(x).startsWith("1")).boxed()
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(list);

	}

}
