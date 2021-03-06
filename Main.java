package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo V14", 15000,"16GB Ram");

		
		Product product2 = new Product();
		product2.id = 2;
		product2.name = "Lenovo V15";
		product2.unitPrice = 17000;
		product2.detail = "32GB RAM";
		
		Product product3 = new Product();
		product3.id = 3;
		product3.name = "Lenovo V16";
		product3.unitPrice = 24000;
		product3.detail = "64GB RAM";
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.name);
			
		}
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Telefon";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);

	}

}
