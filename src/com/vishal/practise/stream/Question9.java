package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Arrange the numbers in Descending/Ascending Order|
 */
public class Question9 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		Arrays.stream(arr).mapToObj(i->i).sorted().forEach(System.out::print);
		System.out.println();
		
		Arrays.stream(arr).mapToObj(i->i).sorted(Comparator.reverseOrder()).forEach(System.out::print);

	}

}
