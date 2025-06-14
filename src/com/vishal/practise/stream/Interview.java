package com.vishal.practise.stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/*Write the code which will take the list of string in yyyy/mm/dd format 
 * and return list of string of dates in dd-mm-yyyy format using stream
*/
public class Interview {

	public static void main(String[] args) {
		List<String> input = Arrays.asList("2025/06/22", "2022/08/31", "2026/05/03", "2025/04/03");

		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter ouFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		List<String> reverseDate = input.stream().map(date -> LocalDate.parse(date, inputFormatter))
				.map(date -> date.format(ouFormatter)).collect(Collectors.toList());

		System.out.println(reverseDate);

	}

}
