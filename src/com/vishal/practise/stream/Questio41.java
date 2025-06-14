package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 41. Can we reuse stream in Java 8 ? 
 */
public class Questio41 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice","Bob","Charlie","Anna");
		
		Supplier< Stream<String>> nameStream = ()->names.stream();
		
		nameStream.get().forEach(System.out::println);
		
		long listSize = nameStream.get().count();
		
		System.out.println(listSize);

	}

}
