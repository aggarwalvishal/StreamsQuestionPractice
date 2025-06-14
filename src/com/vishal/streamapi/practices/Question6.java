package com.vishal.streamapi.practices;

import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {
		String s = "I am learning Streams API in Java";

		Arrays.stream(s.split(" ")).filter(s1 -> s1.replaceAll("[^aeiouAEIOU]", "").length() == 2)
				.forEach(System.out::println);
	}

}
