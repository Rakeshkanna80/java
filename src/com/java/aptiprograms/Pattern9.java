package com.java.aptiprograms;

public class Pattern9 {
	public static void main(String[] args) {
		int n=7,mid=n/2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==mid||j==mid||i+j==n-1+mid||i+j==mid||j==i+mid||i==j+mid) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
