package com.java.Wrapperclass;

public class UnboxingDemo {
	public static void main(String[] args) {
		Integer x=100;//auto unboxing
		int y=x;
		System.out.println(x);
		System.out.println(y);
		
		Integer p=new Integer(200);//manual unboxing
		int q=p.intValue();
		System.out.println(p);
		System.out.println(q);
	}

}
