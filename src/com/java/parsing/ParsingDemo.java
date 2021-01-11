package com.java.parsing;

public class ParsingDemo {
	public static void main(String[] args) {
		String s1="10";
		String s2="20";
		System.out.println("before parsing:"+s1+s2);
		
		Integer i1=Integer.parseInt(s1);
		Integer i2=Integer.parseInt(s2);
		System.out.println("after parsing:"+(i1+i2));
		
		String str1="true";
		String str2="false";
		System.out.println("before parsing boolean:"+str1+str2);
		
		Boolean b1=Boolean.parseBoolean(str1);
		Boolean b2=Boolean.parseBoolean(str2);
		System.out.println("after parsing boolean:"+b1+b2);
	}

}
