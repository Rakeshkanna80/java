package com.java.Thread;

public class BounceTester {

	public static void main(String[] args) {
		Bounce bounce = new Bounce();
		ThreadBounce threadBounce = new ThreadBounce(bounce);
		ThreadBounce threadBounce1 = new ThreadBounce(bounce);
		
		
	}

}
