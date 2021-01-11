package com.java.Thread;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("trace me if you can");
		System.out.println("main method started");
		ThreadDemo demo = new ThreadDemo();
		demo.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		System.out.println("main method ended");

	}

}

class ThreadDemo extends Thread {
	public void run() {
		System.out.println("child method started");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("child method ended");
	}
}
