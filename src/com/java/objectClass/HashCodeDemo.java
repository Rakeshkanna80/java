package com.java.objectClass;

public class HashCodeDemo {
	public static void main(String[] args) {
		Laptop lp=new Laptop();
		Laptop lp1=new Laptop();
		Laptop lp2=lp;//Referred 
		System.out.println("lp:"+lp.hashCode());
		System.out.println("lp1:"+lp1.hashCode());
		System.out.println("lp2:"+lp2.hashCode());

	}

}
class Laptop{
	int x=10;
	//public int hashCode() { //we can override hashCode method
		//return 10;
	}

