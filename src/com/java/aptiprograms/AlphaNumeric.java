package com.java.aptiprograms;

public class AlphaNumeric {
	public static void main(String[] args) {
		String input = "*@-123abcXYZ";
		String numVal = "";
		String upperCase = "";
		String lowerCase = "";
		String Special = "";
		char[] ch = input.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				numVal += ch[i];
			}
			if (ch[i] >= 65 && ch[i] <= 90) {
				upperCase += ch[i];

			}
			if (ch[i] >= 97 && ch[i] <= 122) {
				lowerCase += ch[i];

			}
			if (ch[i] >= 57 && ch[i] <= 65 || ch[i] >= 41 && ch[i] <= 45) {
				Special += ch[i];

			}
		}
		System.out.println("Special:" + Special);
		System.out.println("numVal:" + numVal);
		System.out.println("lowercase:" + lowerCase);
		System.out.println("upperCase:" + upperCase);

	}

}
