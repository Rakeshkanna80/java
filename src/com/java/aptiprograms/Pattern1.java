package com.java.aptiprograms;

public class Pattern1 {
	public static void main(String[] args) {
		int row=7;
		int col=1;
		int mid=row/2;
		for(int i=0;i<row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print(j);
			}
			if(i<mid) {
				col++;
			}
			else {
				col--;
			}
			System.out.println();
			}
	
	}

}
