package com.vishal.practise;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurence {

	public static void main(String[] args) {
		String input = "Hello Hello World";

		Map<Character, Long> frequencyMap = input.chars().mapToObj(c -> (char) c).filter(c-> c!= ' ')
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(frequencyMap);

	}

}
