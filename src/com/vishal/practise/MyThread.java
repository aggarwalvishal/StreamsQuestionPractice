package com.vishal.practise;

public class MyThread extends Thread{

	private Display d;
	
	private String name;

	/**
	 * @param d
	 * @param name
	 */
	public MyThread(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
}
