package com.java.arrays;

import java.util.Arrays;

public class ArraysClassDemo {
	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=3;
		arr[1]=2;
		arr[2]=1;
		arr[3]=4;
		arr[4]=5;
		int[] arr1= {1,2,3,4,5};
		System.out.println("the array before sorting:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println("the array after sorting:");
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println("search an element:"+Arrays.binarySearch(arr, 5));
		
		int[] copiedArr=Arrays.copyOf(arr, 3);
		System.out.println("copiedArr:"+Arrays.toString(copiedArr));
		
		int[] copyOfRange=Arrays.copyOfRange(arr, 2,4);
		System.out.println("copyofrange:"+Arrays.toString(copyOfRange));
		
		boolean equals=Arrays.equals(arr, arr1);
		System.out.println("equals:"+Arrays.equals);
	}

}
