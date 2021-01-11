package com.java.aptiprograms;

import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns");
		int col=sc.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0||i==row/2&&j<=col/2||i==j&&i<=row/2||i+j==row-1&&j<=col/2) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println( );
			
		}
		
		
		
	}

}
