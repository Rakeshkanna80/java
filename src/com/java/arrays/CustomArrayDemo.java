package com.java.arrays;

public class CustomArrayDemo {
	public static void main(String[] args) {
		Sada s=new Sada();
		Chetan c=new Chetan();
		Siddu si=new Siddu();
		Object[] transformer=new Object[3];
		transformer[0]=s;
		transformer[1]=c;
		transformer[2]=si;
		Chetan chetan=(Chetan) transformer[1];
		Sada sada=(Sada) transformer[0];
		System.out.println(chetan.name);
		System.out.println(sada.status);
	}

}
class Sada{
	String name="leader";
	String status="unmarried";
}
class Chetan{
	String name="lalu";
	String status="unmarried";
}
class Siddu{
	String name="siddu";
	String status="unmarried";
}
