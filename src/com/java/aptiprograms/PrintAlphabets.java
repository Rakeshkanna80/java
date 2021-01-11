package com.java.aptiprograms;

import java.util.Scanner;
public class PrintAlphabets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of row");
		int row=sc.nextInt();
		System.out.println("enter the number of column");
		int col=sc.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==row/2||i==0||j==col-1||j==0) {//A
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		System.out.println("-------------------------------");
	
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||i==row/2||i==row-1||j==0||j==col-1) {//B
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||i==row-1||j==0) {//C
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||i==row-1||j==1||j==col-1) {//D
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||i==row/2||i==row-1||j==0) {//E
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||i==row/2||j==0) {//F
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||i==row-1||j==0||i==row/2 && j>=row/2||j==col-1 && i>=row/2) {//G
						System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
				}
			System.out.println();
			}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==row/2||j==0||j==col-1) {//H
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||i==row-1||j==col/2) {//I
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||j==col/2||i==row-1 && j<=col/2||j==0 && i>=col/2) {//J
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0||i==row/2&&j<=col/2||i==j&&j>=col/2||i+j==row-1&&i<=row/2) {//K
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0||i==row-1) {//L
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0||j==col-1||i==j&&i<=col/2||i+j==row-1&&j>=row/2) {//M
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0||j==col-1||i==j) {//N
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||i==row-1||j==0||j==col-1) {//O
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||j==0||i==row/2||j==col-1&&i<=row/2) {//P
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if((i==0&&j!=col-1)||(i==row-2&&j!=col-1)||(j==0&&i!=row-1)||(j==col-2&&i!=row-1)||i==j&&i>=col/2) {//Q
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||j==0||j==col-1&&i<=row/2||i==row/2||i==j&&i>=row/2) {//R
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||i==row/2||i==row-1||j==0&&i<=row/2||j==col-1&&i>=row/2) {//S
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||j==col/2) {//T
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0||j==col-1||i==row-1) {//U
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0&&i<=row/2||j==col-1&&i<=row/2||i==j+row/2||i+j==row-1+row/2) {//v
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0||j==col-1||i==j&&i>=row/2||i+j==row-1&&j<=col/2) {//W
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j||i+j==row-1) {//X
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j&&i<=row/2||i+j==row-1&&j>=col/2||j==col/2&&i>=row/2) {//Y
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||i==row-1||i+j==row-1) {//Z
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		}
	}

