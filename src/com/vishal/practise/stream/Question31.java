package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 31 Calculate the average of all the numbers. 
 */
public class Question31 {

	public static void main(String[] args) {
		
		String s  = "HelloWorldHelloWOrlD";
		
		s.chars().mapToObj(c-> (char)c).filter(c-> Character.isUpperCase(c)).sorted(Comparator.reverseOrder()).forEach(System.out::print);
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		
		double avg = num.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
		
		//System.out.println(avg);
		 

	}

}
