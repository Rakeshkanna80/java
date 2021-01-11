package com.java.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new MyComparator());
		pq.offer(10);
		pq.offer(20);
		pq.offer(30);
		pq.offer(10);
		// pq.remove(10);
		//System.out.println(pq.element());
		System.out.println(pq);
	}

}
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		Integer i1=o1;
		Integer i2=o2;
		if (i1>i2) {
			return -1;
		} else {
			return +1;

		}
		return 0;
	}
	
}
