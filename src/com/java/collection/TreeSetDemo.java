package com.java.collection;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Character> t = new TreeSet<Character>();
		t.add('R');
		t.add('A');
		t.add('K');
		t.add('E');
		t.add('S');
		t.add('H');
		for (Character character : t) {
			System.out.println(character);
		}
	}

}
