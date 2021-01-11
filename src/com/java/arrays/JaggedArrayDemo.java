package com.java.arrays;

public class JaggedArrayDemo {
	public static void main(String[] args) {
		char[][] names=new char[5][];
		names[0]=new char[5];
		names[1]=new char[4];
		names[2]=new char[3];
		names[3]=new char[2];
		names[4]=new char[1];
		
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				names[i][j]='A';
			}
		}
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				System.out.print(names[i][j]+"");
			}
			System.out.println();
		}
	}

}
