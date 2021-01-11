package com.java.x;

public class Sample {
	public static void main(String[] xyz) {
		Abc v=new Abc();
		v.start();
	}
}

class Abc {
	String name;
	String color;

	void start() {
		System.out.println("start by self");

	}
}
