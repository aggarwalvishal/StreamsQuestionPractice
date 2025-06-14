package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 10. Given an array, find the sum of unique elements
 */
public class Question10 {

	public static void main(String[] args) {
		int[] arr = {1,6,7,8,1,1,8,8,7};
		int sum= Arrays.stream(arr).distinct().sum();
		
		System.out.println(sum);
	

	}

}
