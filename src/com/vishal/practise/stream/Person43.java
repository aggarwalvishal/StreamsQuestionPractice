package com.vishal.practise.stream;

import java.util.List;

public class Person43 {

	String name;
	
	List<String> colors;

	/**
	 * @param name
	 * @param colors
	 */
	public Person43(String name, List<String> colors) {
		super();
		this.name = name;
		this.colors = colors;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the colors
	 */
	public List<String> getColors() {
		return colors;
	}

	/**
	 * @param colors the colors to set
	 */
	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	@Override
	public String toString() {
		return "Person43 [name=" + name + ", colors=" + colors + "]";
	}
	
}
