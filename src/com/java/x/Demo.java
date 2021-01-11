package com.java.x;

public class Demo {
	public static void main(String[] args) {
		A a=new A();
		a.a=10;
		a.b=20;
		a.findSum();
		a.calculateSum(10,40);
		
		
	}

}
class A{
	int a;
	int b;
	void findSum(){
		int c = a+b;
		System.out.println(c);
	}
		
	void calculateSum(int x,int y) {
			int z=x+y;
			System.out.println(z);
		}
		
	}

