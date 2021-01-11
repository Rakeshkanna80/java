package com.java.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add('a');
		ll.add('k');
		ll.add('e');
		ll.add('s');
		ll.addFirst('r');
		ll.addLast('h');
		// ll.removeFirst();
		System.out.println("first object:" + ll.getFirst());
		ll.offer('k');

		Iterator i = ll.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}
	}

}
