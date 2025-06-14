package com.vishal.streamapi.practices;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MutliplyFirst2Value {

	public static void main(String[] args) {
		int[] arr = {12,5,6,9,2,4};
		
		int ans =Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().limit(2).reduce(1, (a,b)-> a*b);
		System.out.println(ans);

	}

}
