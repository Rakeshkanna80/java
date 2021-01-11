package com.java.x;

public class Bank {
	public static void main(String[] args) {
		
		Sbi  s=new Sbi();
		System.out.println(s.getInterest());
	}

}
class BankA{
	int getInterest() {
		return 0;
	}
}
class Sbi extends BankA{
	int getInterest() {
		return 5;
		
	}
}
