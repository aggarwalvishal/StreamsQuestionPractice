package com.vishal.practise.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 11 Given a string, find the first non-repeated character
 */
public class Question11 {

	public static void main(String[] args) {
		String s = "Hello World";

		Character nonReapated = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x->x.getValue() ==1).map(m->m.getKey()).findFirst().get();
		
		System.out.println(nonReapated);

	}

}
