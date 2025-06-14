package com.vishal.streamapi.practices;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question8 {

	public static void main(String[] args) {
		String s = "Mississippi";

		Map<Character, Long> occurenceMap = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		occurenceMap.forEach((key, value)-> {System.out.println("Key :"+key+", Value: "+value);});
		System.out.println(occurenceMap);

	}

}
