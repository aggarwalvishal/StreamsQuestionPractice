package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 40. Multiply array elements(Conceptual) 
 */
public class Question40 {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5};
		
		List<Integer> list = Arrays.asList(arr);
		
		int sum =list.stream().reduce(1, (a,b)-> a*b);
		
		System.out.println(sum);
	}

}
