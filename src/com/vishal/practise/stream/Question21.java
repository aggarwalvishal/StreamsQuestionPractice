package com.vishal.practise.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 21 Given the string[] group the strings based on the middle character
 */
public class Question21 {

	public static void main(String[] args) {
		String[] str = { "ewe", "jji", "jhj", "kwk", "aha" };

		Map<String, List<String>> list = Stream.of(str)
				.collect(Collectors.groupingBy(x -> x.toString().substring(1, 2)));
		
		System.out.println(list);

	}

}
