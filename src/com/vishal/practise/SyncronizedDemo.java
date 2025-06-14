package com.vishal.practise;

public class SyncronizedDemo {

	public static void main(String[] args) {
		Display d = new Display();
		
		MyThread t1 = new MyThread(d, "thread-1");
		MyThread t2 = new MyThread(d, "thread-2");
		t1.start();
		t2.start();

	}

}
