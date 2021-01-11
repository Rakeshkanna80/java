package com.java.x;

import java.util.Scanner;

public class LightFactory {
	
	
	static public Object getLight(String light) {
		if (light.equalsIgnoreCase("TubeLight")) {
			return "TubeLightImpl";
		}
		else if (light.equalsIgnoreCase("CflBulb")) {
			return "CflBulbImpl";
		}
		else {
			return "No Light Found";
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the tubelight");
		String light=sc.next();
		String lightObject=(String) LightFactory.getLight(light);
		System.out.println(lightObject);
		sc.close();
		
	}

}
