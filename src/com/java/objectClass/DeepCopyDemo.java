package com.java.objectClass;

public class DeepCopyDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Car1 c=new Car1();
		Car1 c1=(Car1)c.clone();
		c.brandName="Audi";
		c.e.type="Petrol";
		System.out.println("c1:"+c1.brandName);
		System.out.println("c:"+c.brandName);
		System.out.println("c1:"+c1.e.type);
		System.out.println("c:"+c.e.type);
		
	}
}
class Car1 implements Cloneable{
	String brandName="BMW";
	String modelName="M5";
	Engine1 e=new Engine1();
	public Car1 clone() throws CloneNotSupportedException {
		Car1 Car1=(Car1)super.clone();
		Car1.e=new Engine1();
		return Car1;
		}
}
class Engine1{
	String type="Diesel";
}
