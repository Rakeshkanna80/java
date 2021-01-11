package com.java.exception;

import java.io.IOException;

public class   {
	 public static void main(String[] args) throws IOException {
		Child c=new Child();
		c.m1();
	}

}
class Parent{
	void m1() throws IOException {
		System.out.println("parent method");
	}
}
class Child extends Parent{
	@Override
	void m1() {
		System.out.println("child method");
	}
}