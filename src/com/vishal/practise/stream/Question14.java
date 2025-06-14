package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 14 Given a list of strings, create a list that contains only integers
 */
public class Question14 {

	public static void main(String[] args) {
		String[] arr = { "abc", "123", "456", "def" };

		List<Integer> ansList = Arrays.stream(arr).filter(s -> s.matches("[0-9]+")).map(Integer::valueOf)
				.collect(Collectors.toList());
		System.out.println(ansList);

	}

}
