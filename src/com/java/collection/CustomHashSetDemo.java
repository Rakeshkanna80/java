package com.java.collection;

import java.util.HashSet;

public class CustomHashSetDemo {
	public static void main(String[] args) {
		HashSet<Aadhar> setOfaadhar = new HashSet<Aadhar>();
		Aadhar aadhar1 = new Aadhar(123456789l, "rakesh", "bidar", "24-09-1996");
		Aadhar aadhar2 = new Aadhar(987654321l, "sachin", "blore", "25-02-1999");
		Aadhar aadhar3 = new Aadhar(987654321l, "sachin", "blore", "25-02-1999");

		setOfaadhar.add(aadhar1);
		setOfaadhar.add(aadhar2);
		setOfaadhar.add(aadhar3);

		for (Aadhar aadhar : setOfaadhar) {
			System.out.println(aadhar);
		}

	}

}

class Aadhar {
	long number;
	String name;
	String address;
	String dob;

	Aadhar(long number, String name, String address, String dob) {
		this.number = number;
		this.name = name;
		this.address = address;
		this.dob = dob;

	} 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (number ^ (number >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aadhar other = (Aadhar) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aadhar [number=" + number + ", name=" + name + ", address=" + address + ", dob=" + dob + "]";
	}
}
