package com.java.abstraction;

public class AbstractDemo {
	public static void main(String[] args) {
		Nokia n=new Microsoft();
		n.downArrow();
		n.upArrow();
		n.leftArrow();
		n.rightArrow();
	}

}
abstract class Mobile{
	abstract void leftArrow();
	abstract void rightArrow();
	abstract void upArrow();
	abstract void downArrow();
	
}
abstract class Nokia extends Mobile{
	@Override
	void leftArrow() {
		System.out.println("leftarrow");
		
	}
	@Override
	void downArrow() {
		System.out.println("downarrow");
		
	}@Override
	void upArrow() {
		System.out.println("uparrow");
		
	}
}
class Microsoft extends Nokia{
	@Override
	void rightArrow() {
		System.out.println("rightarrow");
		
	}
}