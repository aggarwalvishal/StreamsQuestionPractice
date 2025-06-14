package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 16 Group /Pair anagrams from a list of Strings.
 */
public class Question16 {

	public static void main(String[] args) {
		String[] s = { "pat", "tap", "pan", "nap", "Team", "tree", "meat" };

		List<String> list = Arrays.asList(s);

		 List<List<String>> anagramList = list.stream().collect(Collectors
				.groupingBy(x -> Arrays.stream(x.toLowerCase().split("")).sorted().collect(Collectors.toList())))
				.entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
		System.out.println(anagramList);

	}

}
