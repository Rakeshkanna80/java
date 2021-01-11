package com.java.abstraction;

public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		TaxCalculator tc=new TaxCalculator();
		tc.fuelTax();
		tc.roadTax();
	}

}
interface CentralTax{
	void roadTax();
}
interface StateTax{
	void fuelTax();
}
class TaxCalculator implements CentralTax,StateTax{

	@Override
	public void fuelTax() {
System.out.println("calculate statetax");		
	}

	@Override
	public void roadTax() {
System.out.println("calculate centraltax");		
	}
	
}

