package com.vishal.streamapi.practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreateAnIntArray {

	public static void main(String[] args) {
		String[] s = { "abc", "123", "456", "xyz" };

		List<Integer> nList = Arrays.stream(s).filter(i -> i.matches("[0-9]+")).map(Integer::valueOf)
				.collect(Collectors.toList());
		System.out.println(nList);
	}

}
