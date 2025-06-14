package com.vishal.practise.stream;

import java.util.stream.IntStream;

/**
 * 17 Write a stream program to multiply alternative numbers in an array
 */
public class Question17 {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 1, 7, 2, 9, 2 };

		int ans = IntStream.range(0, arr.length).filter(i -> i % 2 != 0).map(i -> arr[i]).reduce(1, (a, b) -> a * b);
		
		System.out.println(ans);

	}

}
