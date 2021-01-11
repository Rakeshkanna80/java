package com.java.collection;

import java.util.ArrayList;

public class CustomArrayList {
	public static void main(String[] args) {
		ArrayList CarromBoard = new ArrayList();
		Pawns p1 = new Pawns("cream", 10.10, 20);
		Pawns p2 = new Pawns("cream", 10.10, 20);
		Pawns p3 = new Pawns("black", 10.10, 20);
		Pawns p4 = new Pawns("black", 10.10, 20);
		Pawns p5 = new Pawns("pink", 10.10, 20);
		Striker s = new Striker("white", 20.10, 30);
		CarromBoard.add(p1);
		CarromBoard.add(p2);
		CarromBoard.add(p3);
		CarromBoard.add(p4);
		CarromBoard.add(p5);
		CarromBoard.add(s);

		for (Object obj : CarromBoard) {
			if (obj instanceof Pawns) {
				Pawns p = (Pawns) obj;
				if (p.color.equals("pink")) {
					System.out.println(p);
				}

			} else {
				Striker striker = (Striker) obj;
				// System.out.println(s);

			}

		}
	}

}

class Pawns {
	String color;
	double weight;
	int size;

	public Pawns(String color, double weight, int size) {
		this.color = color;
		this.size = size;
		this.weight = weight;

	}

	@Override
	public String toString() {
		return "Pawns [color=" + color + ", weight=" + weight + ", size=" + size + "]";
	}
}

class Striker {
	String color;
	double weight;
	int size;

	public Striker(String color, double weight, int size) {
		this.color = color;
		this.size = size;
		this.weight = weight;

	}

	@Override
	public String toString() {
		return "Striker [color=" + color + ", weight=" + weight + ", size=" + size + "]";
	}

}
