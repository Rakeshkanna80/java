package com.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithNonComparableObjects {
	public static void main(String[] args) {
		TreeSet<StringBuffer> ts=new TreeSet<StringBuffer>(new MyComparator());
		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("B"));
		ts.add(new StringBuffer("C"));
		ts.add(new StringBuffer("D"));
		System.out.println(ts);
	}

}
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		System.out.println(s1+"&"+s2);
		return 0;
	}
	
}
