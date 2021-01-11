package com.java.Encapsulation;

public class Product {
	private String prodName;
	private String brand;
	private double price;
	private long barCode;

	public Product() {
		System.out.println("product DC");
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getprodName() {
		return this.prodName;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public String getbrand() {
		return this.brand;
	}

	public void setprice(double price) {
		this.price = price;
	}

	public double getprice() {
		return this.price;
	}

	public void setbarCode(long barCode) {
		this.barCode = barCode;
	}

	public long getbarCode() {
		return this.barCode;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Product p1 = new Product();
		p1.setProdName("laptop");
		p1.setbrand("Dell");
		p1.setprice(52252.25);
		p1.setbarCode(85858585858585l);

		System.out.println(p1.getprodName());
		p1.getbrand();
		p1.getbarCode();
		p1.getprice();
		System.out.println("main method ended");
	}
}
