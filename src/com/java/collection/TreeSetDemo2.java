package com.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator1());
		ts.add(5);
		ts.add(3);
		ts.add(1);
		ts.add(2);
		ts.add(4);
		System.out.println(ts);

	}

}

class MyComparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i1 < i2) {
			return +1;
		} else if (i1 > i2) {
			return -1;

		} else {
			return 0;
		}

	}

}
