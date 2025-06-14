package com.vishal.practise.stream;

import java.util.stream.Stream;
/**
 * 44. Concatenate 2 streams
 */
public class Question44 {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("Java","Python");
		Stream<String> s2 = Stream.of("C++","C#");
		
		Stream<String> concat = Stream.concat(s1, s2);
		
		concat.forEach(System.out::println);

	}

}
