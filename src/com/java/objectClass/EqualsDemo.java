package com.java.objectClass;

public class EqualsDemo {
	public static void main(String[] args) {
		Sunil sunil1=new Sunil("Sunil Home","light brown",0.0,26,"married");
		Sunil sunil2=new Sunil("Sunil Home","light brown",0.0,26,"married");
		Sunil sunil3=new Sunil("Sunil Class","tan brown",0.1,26,"single");
		System.out.println(sunil1.equals(sunil2));
	}

}
class Sunil{
	String name;
	String color;
	double price;
	int age;
	String status;
	Sunil(String name,String color,double price,int age,String status){
	this.name=name;
	this.color=color;
	this.price=price;
	this.age=age;
	this.status=status;	
	}
	public boolean equals(Object o) {
		if(o instanceof Sunil) {
			Sunil s=(Sunil)o;
		if(name.equals(s.name)) {
			if(color.equals(s.color)) {
				if(price==s.price) {
					if(age==s.age) {
						if(status.equals(s.status)) {
							return true;
						}
						else {
							return false;
						}
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
			
		}
		return false;
	}
}
