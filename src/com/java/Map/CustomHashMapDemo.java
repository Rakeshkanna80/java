package com.java.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CustomHashMapDemo {
	public static void main(String[] args) {
		Taluk humnabad=new Taluk("humnabad");
		Taluk hallikhed=new Taluk("hallikhed");
		Taluk sedam=new Taluk("sedam");
		Taluk wadi=new Taluk("wadi");
		
		
		ArrayList<Taluk> bidar=new ArrayList<Taluk>();
		bidar.add(humnabad);
		bidar.add(hallikhed);
		ArrayList<Taluk> gulbarga=new ArrayList<Taluk>();
		gulbarga.add(sedam);
		gulbarga.add(wadi);
		
		HashMap<String,ArrayList<Taluk>> mapOfDistrictAndTaluks=new HashMap<String,ArrayList<Taluk>>();
		mapOfDistrictAndTaluks.put("bidar",bidar);
		mapOfDistrictAndTaluks.put("gulbarga",gulbarga);
	
		
		for (Map.Entry<String, ArrayList<Taluk>> districtEntry:mapOfDistrictAndTaluks.entrySet()){
			String districtName=districtEntry.getKey();
			List<Taluk> taluks = districtEntry.getValue();
			for(Taluk taluk : taluks) {
				Taluk t=taluk;
				if(t.name.equals("sedam")) {
					System.out.println(t.name+" comes under "+districtName);
				}
			}
			
			
		}
		
	}

}
class Taluk{
	String name;
	Taluk(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return "Taluk [name="+name+"]";
	}
}
