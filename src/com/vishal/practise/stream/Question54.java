package com.vishal.practise.stream;

import java.util.stream.IntStream;

/**
 * 54. Given a string print the count of a particular substring.
 */
public class Question54 {

	public static void main(String[] args) {
		String s = "byebyeBirdiebye";
		String check = "bye";
		
		long count = IntStream.range(0, s.length()-2).filter(x->s.substring(x, x+3).equals(check)).count();
		
		System.out.println(count);

	}

}
