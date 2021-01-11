package com.java.collection;

import java.util.TreeSet;

public class ComparableDemo {
	public static void main(String[] args) {
		TreeSet<PoliceStation> ts = new TreeSet<PoliceStation>();
		PoliceStation p = new PoliceStation(1, "Bidar");
		PoliceStation p1 = new PoliceStation(2, "humnabad");
		PoliceStation p2 = new PoliceStation(3, "bhalki");
		PoliceStation p3 = new PoliceStation(4, "basavakalyan");
		PoliceStation p4 = new PoliceStation(5, "mannakheli");
		ts.add(p4);
		ts.add(p3);
		ts.add(p2);
		ts.add(p1);
		ts.add(p);
		for (PoliceStation ps : ts) {
			System.out.println(ps);
		}
	}

}

class PoliceStation implements Comparable {
	int stationId;
	String location;

	PoliceStation(int stationId, String location) {
		this.stationId = stationId;
		this.location = location;

	}

	@Override
	public String toString() {
		return "PoliceStation [stationId=" + stationId + ", location=" + location + "]";
	}

	@Override 
	public int compareTo(Object o) {
		PoliceStation ps=(PoliceStation)o;
		if (this.stationId<ps.stationId) {
			return +1;
		} else if(this.stationId>ps.stationId){
			return -1;

		}
		return 0;
	}
	
	
	
}
