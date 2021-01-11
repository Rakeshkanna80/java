 package com.java.exception;

public class CustomUncheckedExceptionDemo {
	public static void main(String[] args) {
		Bank b=new Bank();
		try {
			b.meetManager();
		} catch (BankException be) {
			// TODO: handle exception
			System.out.println(be);
		}
		
	}

}
class BankException extends RuntimeException{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "manager not found";
	}
	
}
class Bank{
	boolean isManagerPresent=false;
	void meetManager() {
		if (isManagerPresent) {
			System.out.println("hello..");
		}
		else {
			BankException be=new BankException();
			throw be;
		}
	}
	
}
