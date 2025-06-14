package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 57. Using Stream API extract messages in the correct chronological order from
 * the given log data in format "HH:MM:ID:Message"
 */
public class Question57 {

	public static void main(String[] args) {
		List<String> logs = Arrays.asList("14:30:3:Server started", "14:30:1:User logged in",
				"14:29:2:Database connected", "18:32:4:User logged out");
		
		List<String> messageFormat = logs.stream().sorted((log1, log2)->{
			String[] part1 = log1.split(":");
			String[] part2 = log2.split(":");
			
			int hour1 = Integer.parseInt(part1[0]);//HH
			int minute1 = Integer.parseInt(part1[1]);//MM
			int id1 = Integer.parseInt(part1[2]);//id
			
			int hour2 = Integer.parseInt(part2[0]);//HH
			int minute2 = Integer.parseInt(part2[1]);//MM
			int id2 = Integer.parseInt(part2[2]);//id
			
			if(hour1 != hour2) 
				return Integer.compare(hour1, hour2);
			if(minute1!=minute2)
				return Integer.compare(minute1, minute2);
			return Integer.compare(id1, id2);
			
		}).map(log->log.split(":",4)[3]).collect(Collectors.toList());
		

		System.out.println(messageFormat);
	}

}
