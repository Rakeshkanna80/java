package com.java.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> setXworkzId=new LinkedHashSet<Integer>();
		setXworkzId.add(101);
		setXworkzId.add(102);
		setXworkzId.add(103);
		setXworkzId.add(104);
		setXworkzId.add(105);
		for (Integer integer : setXworkzId) {
			System.out.println(integer);
		}
	}

}
