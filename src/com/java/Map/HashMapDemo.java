package com.java.Map;

import java.util.HashMap;
import java.util.Map;


public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "core java");
		map.put(2, "adv java");
		map.put(3, "jdbc");
		map.put(4, "jee");
		map.put(5, "framework");
		System.out.println(map.keySet());
		
		for(Map.Entry<Integer,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
				
	}

}
