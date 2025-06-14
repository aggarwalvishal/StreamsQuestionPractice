package com.vishal.practise.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 35. Generate the first 10 numbers of the Fibonacci Sequence
 */
public class Question35 {
	// 0,1,1,2,3,5,8,13,21,34
	public static void main(String[] args) {
		List<Integer> fibbonic = Stream.iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] }).limit(10)
				.map(f -> f[0]).collect(Collectors.toList());
		System.out.println(fibbonic);

		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.print(a + " ");
		for (int i = 1; i < 10; i++) {
			System.out.print(b + " ");
			sum = a + b;
			a = b;
			b = sum;

		}

	}

}
