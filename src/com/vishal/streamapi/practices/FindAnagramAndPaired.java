package com.vishal.streamapi.practices;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FindAnagramAndPaired {

	public static void main(String[] args) {
		String[] s = { "pat", "tap", "pan", "nap", "Team", "tree", "meat" };

		Collection<List<String>> ans = Arrays.asList(s).stream().collect(Collectors
				.groupingBy(x -> Arrays.stream(x.toLowerCase().split("")).sorted().collect(Collectors.toList())))
				.values();
		System.out.println(ans);

	}

}
