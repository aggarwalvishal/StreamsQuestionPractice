package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;

public class Question22 {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		
		int sum =num.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum);

	}

}
