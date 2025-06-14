package com.vishal.streamapi.practices;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question7 {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,2,3,4,6,7,10,14,34,45);
		
		Map<Boolean, List<Integer>> partition = integerList.stream().collect(Collectors.partitioningBy(n-> n%2 ==0));
		
		System.out.println(partition);
		
		List<Integer> oddList = partition.get(false);
		List<Integer> evenList = partition.get(true);
		
		System.out.println(oddList);
		System.out.println(evenList);
	}

}
