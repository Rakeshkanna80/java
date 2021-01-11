package com.java.aptiprograms;

public class Pattern7 {
	public static void main(String[] args) {
		int n=4;
		int star=1;
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print("   ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print(" * ");
			}
			star+=2;
			System.out.println("   ");
		}
	}

}
