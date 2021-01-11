package com.java.x;

public class A {
	public String name;
	public int a;
	public long l;

	public A() {
		System.out.println("hi-dc");
	}

	public A(String name) {
		this.name = name;

	}
	public A(int a,long l) {
		this("sac");
		this.a=a;
		this.l=l;
	}

	public void details() {
		// TODO Auto-generated method stub
		System.out.println("name"+name+"="+"a"+a+"="+"l"+l);
	}

	public static void main(String[] args) {
		A a = new A("rak");
		A b=new A(10,852147933l);
		//a.details();
		b.details();

	}
}
