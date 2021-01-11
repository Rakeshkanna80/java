package com.java.abstraction;

public class AbstractClassDemo {
	public static void main(String[] args) {
		Pen p=new Cello();
		p.ink();
		System.out.println("the color of cello pen is :");
		Pen p1=new Flair();
		p1.ink();
		System.out.println("the color of flair pen is :");
	}

}
abstract class Pen{
	void writting() {
		System.out.println("writting");
	}
	abstract void ink();
}
class Cello extends Pen{
	void ink() {
		System.out.println("blue");
	}
}
class Flair extends Pen{
	void ink() {
		System.out.println("black");
	}
}