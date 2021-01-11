package com.java.constructorchaining;

public class sample {
	public static void main(String[] args) {
		C c=new C();
	}

}
class A{
	A(){
		System.out.println("default in a");
	}
}
class B extends A{
	B(){
		System.out.println("default in b");
	}
}
class C extends B{
	C(){
		super();
 
		System.out.println("default in c");
	}
}