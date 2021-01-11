package com.java.aptiprograms;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of row");
		int row=sc.nextInt();
		System.out.println("enter the number of column");
		int col=sc.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j>=row/2) {
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
