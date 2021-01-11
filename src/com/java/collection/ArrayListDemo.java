package com.java.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList nonVeg=new ArrayList();
		nonVeg.add("chicken biryani");
		nonVeg.add("fish fry");
		nonVeg.add("prawn");
		ArrayList foodItems=new ArrayList();
		foodItems.add("dhokla");
		foodItems.add("roti");
		foodItems.add("holige");
		foodItems.addAll(nonVeg);
		System.out.println(foodItems);
		System.out.println(foodItems.size());
		System.out.println(foodItems.contains("roti"));
		System.out.println(foodItems.get(0));
		System.out.println(foodItems.isEmpty());
		System.out.println(foodItems.remove(2));
		System.out.println(foodItems.subList(0, 2));
		foodItems.clear();
		System.out.println(foodItems);

		}

}


