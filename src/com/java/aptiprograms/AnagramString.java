package com.java.aptiprograms;

public class AnagramString {
	public static void main(String[] args) {
		String s1="sada";
		String s2="dasa";
		int count=0;
		if (s1.length()==s2.length()) {
			
			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					if (s1.charAt(i)==s2.charAt(j)) {
						count ++;
						break;
					}
				}
				
			}
			
		}
	}

}
