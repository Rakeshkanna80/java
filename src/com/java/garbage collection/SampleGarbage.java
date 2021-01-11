package com.java;

public class SampleGarbage {
	public static void main(String[] args) {
		
		Garbage g=new Garbage();
				g=null;
		
		System.gc();
		
	}
}
class Garbage{
	 protected void finalize() {
		System.out.println("Garbage");
	}
}
