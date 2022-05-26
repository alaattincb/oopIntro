package oopIntro;

public class Product {	
	public Product() {
		System.out.println("Ben Çalıştım");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.unitPrice = unitPrice;
	}
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
