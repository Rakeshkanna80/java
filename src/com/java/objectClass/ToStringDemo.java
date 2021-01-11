package com.java.objectClass;

public class ToStringDemo {
	public static void main(String[] args) {
		Mobile m1=new Mobile("Redmi",14000.00,"Note7pro",5254847931356l);
		Mobile m2=new Mobile("Samsung",10000.00,"galaxy",8789878989887l);
		System.out.println(m1);
		System.out.println("----------------");
		System.out.println(m2);
	}

}
class Mobile{
	String brandName;
	double price;
	String model;
	long imeiNum;
	Mobile(String brandName,double price,String model,long imeiNum){
		this.brandName=brandName;
		this.price=price;
		this.model=model;
		this.imeiNum=imeiNum;
	}
	/*public String toString() {
		return brandName+"\n"+price+"\n"+model+"\n"+imeiNum;
	}*/
	@Override
	public String toString() {
		return "Mobile [brandName=" + brandName + ", price=" + price + ", model=" + model + ", imeiNum=" + imeiNum
				+ "]";
	}
}
