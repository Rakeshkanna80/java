package com.java.logical;

public class Factorial {

	public static void main(String[] args) {
		// input=5!
		// output=120=5*4*3*2*1

		int n = 5;
		int m = 1;
		/*
		 * for (int i = 1; i <=5; i++) { m=m*i;
		 * 
		 * }
		 */

		int total = 1;
		for (int i = 2; i <= 5; i++) {

			m = m * i;
			total += m;
			System.out.println(m);

		}
		System.out.println(total);
	}

}
