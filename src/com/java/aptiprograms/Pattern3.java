package com.java.aptiprograms;

public class Pattern3 {
	public static void main(String[] args) {
		int row=11;
		int col=11;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j||i+j==row-1||j==col/2||i==row/2||i==0||j==0||i==row-1||j==col-1) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
