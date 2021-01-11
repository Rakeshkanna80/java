package com.java.Thread;

public class ThreadBounce extends Thread{
	Bounce bounce;
	
	public ThreadBounce(Bounce bounce) {
		this.bounce=bounce;
	}
	public void run() {
		Bounce.bookBike();
		Bounce.endRide();
		bounce.startRide();
	}
}
