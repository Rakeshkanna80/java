package com.java.finalkeyword;

public class FinalKeywordWithConstructor {
	final int I;
	FinalKeywordWithConstructor(){
		I=10;
	}
	FinalKeywordWithConstructor(int a){
		I=a;
	}
	public static void main(String[] args) {
		FinalKeywordWithConstructor fc=new FinalKeywordWithConstructor();
		FinalKeywordWithConstructor fc1=new FinalKeywordWithConstructor();
		System.out.println(fc.I);
		System.out.println(fc1.I);
	}

}
