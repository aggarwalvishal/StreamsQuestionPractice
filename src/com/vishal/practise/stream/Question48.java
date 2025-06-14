package com.vishal.practise.stream;

import java.util.Arrays;

/**
 * Convert multidimension array to single dimenssion.
 */
public class Question48 {

	public static void main(String[] args) {
		int[][] arr = {{1,2},{3,4},{5,6}};
		
		int[] newarr = Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
		
		Arrays.stream(newarr).forEach(System.out::print);

	}

}
