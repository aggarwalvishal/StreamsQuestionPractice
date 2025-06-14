package com.vishal.practise.stream;

import java.util.stream.IntStream;

/**
 * 50. Print the middle character of a given String
 */
public class Question50 {

	public static void main(String[] args) {
		String s = "education";

		int lenght = s.length();

		int mid = lenght / 2;

		String midChar = IntStream.range(0, lenght).filter(x -> x % 2 == 0 ? (x == mid || x == mid - 1) : x == mid)
				.mapToObj(s::charAt).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
				.toString();
		
		System.out.println(midChar);

	}

}
