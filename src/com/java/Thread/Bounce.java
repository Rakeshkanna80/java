package com.java.Thread;

public class Bounce {
	public static void bookBike() {
		System.out.println(Thread.currentThread().getName() + "booked bike");
	}

	public synchronized void startRide() {
		System.out.println(Thread.currentThread().getName() + "ride started");
	}

	public static synchronized void endRide() {
		System.out.println(Thread.currentThread().getName() + "ride ended");
	}

}
