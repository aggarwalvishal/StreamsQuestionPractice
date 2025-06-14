package com.vishal.practise.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 60. Transform one object into another
 */
public class Questions60 {

	public static void main(String[] args) {
		List<Employee60> empList = List.of(new Employee60(1, "Vishal"),new Employee60(2, "Vikas"));
		
		List<EmployeeDTO> empDToList = empList.stream().map(emp->new EmployeeDTO(emp.getId(), emp.getName()))
				.collect(Collectors.toList());
		
		System.out.println(empDToList);

	}

}
