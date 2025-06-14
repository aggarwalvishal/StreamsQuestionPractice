package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Question15 {

	public static void main(String[] args) {
		int[] arr = { 12, 5, 6, 9, 2, 4 };

		int ans = Arrays.stream(arr).boxed().collect(Collectors.toList())
				.stream().limit(4).reduce(1, (a, b) -> a * b);
		
		System.out.println(ans);

	}

}
