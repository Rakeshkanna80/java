package com.java.exception;

public class ExceptionHandlerInCallStack {
	private static int dividedByZero(int a,int b) {
		return a/b;
	}
	private static int computeDivision(int a,int b) {
		try {
			return dividedByZero(a,b);
			
		} catch (ArithmeticException e) {
			return 0;
		}
		
	}
	public static void main(String[] args) {
		try {
			System.out.println(computeDivision(3, 0));	
		}
		catch (ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
		
		
		
		/*String s=null;
		System.out.println(s.length());//nullpointer exception*/
		
		
	}

}
