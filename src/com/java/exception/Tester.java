package com.java.exception;

public class Tester {

	public static void main(String[] args) {

		C.m3();
		System.out.println("hello");

	}

}

class A {
	static int m1(int x, int y) {

		return x / y;
	}
}

class B extends A {

	static void m2() {
		try {
			A.m1(1, 0);

		} catch (Exception e) {
			System.out.println("hi");
		}
	}
}

class C extends B {
	static void m3() {
		B.m2();

	}
}
