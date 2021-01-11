package com.java.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, String> t=new TreeMap<String, String>();
		t.put("india","delhi");
		t.put("russia","moscow");
		t.put("nepal","kathmandu");
		t.put("china","beijing");
		t.put("usa","washington dc");
		
		for (Map.Entry<String, String> entry:t.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}

}
