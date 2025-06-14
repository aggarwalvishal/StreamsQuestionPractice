package com.vishal.streamapi.practices;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		String s = "Hello World";
		Character ch = s.chars().mapToObj(c-> (char)c).filter(c-> !Character.isWhitespace(c))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(m-> m.getValue() > 1).map(m-> m.getKey()).findFirst().get();
		
		System.out.println(ch);

	}

}
