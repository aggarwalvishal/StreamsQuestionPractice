package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Find and print strings containing only digits.
 */
public class Question29 {

	public static void main(String[] args) {
		List<String> s = Arrays.asList("123", "abc", "123abc", "45");
		Pattern pattern = Pattern.compile("[0-9]");
		s.stream().filter(s1->s1.matches("[0-9]+")).collect(Collectors.toList()).forEach(System.out::print);

	}

}
