package com.vishal.streamapi.practices;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given a sentence, find the word that has the highest length 
 */
public class Question1 {

	public static void main(String[] args) {
		String s = "I am learning Streams API in java";
		
		String maxLen = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
		
		System.out.println(maxLen);

	}

}
