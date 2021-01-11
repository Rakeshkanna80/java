package com.java.abstraction;

public class InterfaceDemo {
	public static void main(String[] args) {
		Computer c=new Computer();
		Sony s=new Sony();
		Epson e=new Epson();
		c.slot(e);
		c.slot(s);
		
	}

}
interface Printer{
	void print();
}
class Sony implements Printer{

	@Override
	public void print() {
System.out.println("printing from sony");		
	}
	
}
class Epson implements Printer{

	@Override
	public void print() {
System.out.println("printing from epson");		
	}
	
}
class Computer{
	void slot(Printer p) {
		p.print();
	}
}