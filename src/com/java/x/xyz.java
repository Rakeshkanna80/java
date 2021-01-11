package com.java.x;

public class xyz {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.name = "hero";
		System.out.println(v.name);
		Vehicle v1 = new Vehicle("yamaha");
		v.start();
		v.stop();

	}

}

class Vehicle {
	String name;

	void start() {
		System.out.println("starting by self");
	}

	void stop() {
		System.out.println("stoping");
	}

	Vehicle() {
		System.out.println("default constructor");
	}

	Vehicle(String n) {
		System.out.println("parameterised constructor");
		System.out.println(n);
	}
}
