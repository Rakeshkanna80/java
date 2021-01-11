package com.java.exception;

public class ExceptionWithMethodOverridingRule2 {
	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.hardDiskSize();
	}
}
class Computer{
	void hardDiskSize() {
		System.out.println("HDSC ");
	}
}
class Laptop extends Computer{
	@Override
	void hardDiskSize() throws ArithmeticException{
		System.out.println("HDSL");
	}
}
