package com.java.objectClass;

public class ShallowCopyDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Car c=new Car();
		Car c1=(Car)c.clone();
		c.brandName="Audi";
		c.e.type="Petrol";
		System.out.println("c1:"+c1.brandName);//here it doesn't effect other object.
		System.out.println("c:"+c.brandName);
		System.out.println("c1:"+c1.e.type);//here it effects both the objects.
		System.out.println("c:"+c.e.type);
		
	}

}
class Car implements Cloneable{
	String brandName="BMW";
	String modelName="M5";
	Engine e=new Engine();
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Engine{
	String type="Diesel";
}
