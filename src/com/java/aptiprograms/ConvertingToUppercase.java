package com.java.aptiprograms;

public class ConvertingToUppercase {
	public static void main(String[] args) {
		String line="transformer";
		char[] ch=line.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>=97 && ch[i]<=122) {
				ch[i]=(char)(ch[i]-32);	
			}
		}
		for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]);	
		}
	}

}
