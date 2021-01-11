package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> setOfEmailIds=new HashSet<String>();
		setOfEmailIds.add("exception123@gmail.com");
		setOfEmailIds.add("sachinkanna80@gmail.com");
		setOfEmailIds.add("error@gmail.com");
		setOfEmailIds.add("exception123@gmail.com");
		
		Iterator<String> itr=setOfEmailIds.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
