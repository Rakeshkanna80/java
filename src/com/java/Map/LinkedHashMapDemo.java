package com.java.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Character,String> l=new LinkedHashMap<Character,String>();
		l.put('A',"Austria");
		l.put('B',"Berlin");
		l.put('C',"California");
		l.put('D',"Dubai");
		l.put('C',"columbia");
		l.put(null,null);
		l.put(null,null);
		System.out.println(l);
		
		for (Map.Entry<Character,String>entry:l.entrySet()) {
			System.out.println(entry.getKey()+" for "+entry.getValue());
		}
	}

}
