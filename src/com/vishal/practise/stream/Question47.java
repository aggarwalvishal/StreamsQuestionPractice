package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/** 
 * 47. Given a list of names, find all the names that starts with 'A'
 * and also print the count of names found.
 */
public class Question47 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ema","Bob","Alice","Anna");
		
		Stream<String> s1 = names.stream().filter(s->s.startsWith("A"));
		
		//s1.forEach(System.out::println);	
		try {
			long count = s1.count();
			System.out.println(count);
		}catch(IllegalStateException e) {
			e.getMessage();
		}

	}

}
