package com.vishal.streamapi.practices;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Question19 {

	public static void main(String[] args) {
		int[] arr = { 5, 0, 1, 0, 8, 0 };

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

	   List<Integer> nList =list.stream().collect(Collectors.partitioningBy(x -> x != 0)).values().stream()
				.flatMap(x ->x.stream()).collect(Collectors.toList());
		System.out.println(nList);

	}

}
