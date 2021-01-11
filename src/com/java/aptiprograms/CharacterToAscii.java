package com.java.aptiprograms;

public class CharacterToAscii {
	public static void main(String[] args) {
		CharacterToAscii ca=new CharacterToAscii();
		ca.charToint();
		ca.intToChar();
	}
	void charToint() {
		char ch='@';
		
		
		System.out.println((int)ch);
	}
	
	void intToChar() {
		int a=99;
		System.out.println((char)a);
		
	}
}
