package com.java.aptiprograms;

public class Pattern8 {
	public static void main(String[] args) {
		int row=5;
		int star=1;
		int mid=row/2;
		int space=row-1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			if(i<=mid) {
				space--;
				star+=2;
			}
			else {
				space++;
				star-=2;
			}
			System.out.println(" ");
		}
	}

}
