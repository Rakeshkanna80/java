package com.java.Wrapperclass;

public class BoxingDemo {
	public static void main(String[] args) {
		int i=10;
		Integer j=i;//auto boxing
		System.out.println(i);
		System.out.println(j);
		
		int a=20;//manual boxing
		Integer b=new Integer(a);
		System.out.println(a);
		System.out.println(b);
	}

}
