package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 19 Write a stream program to move all zero’s to beginning of array
 */
public class Question19 {

	public static void main(String[] args) {
		int[] arr = {5,0,1,0,8,0};
		
		 List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList())
				.stream().collect(Collectors.partitioningBy(x->x!=0,Collectors.toList()))
				.values().stream().flatMap(x->x.stream()).collect(Collectors.toList());
		
		System.out.println(list);

	}

}
