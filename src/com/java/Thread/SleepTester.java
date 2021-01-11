package com.java.Thread;

public class SleepTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSleep t=new ThreadSleep();
		t.start();
		t.interrupt();
	}

}
