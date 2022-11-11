package streamApi;

import java.util.ArrayList;

public class Product {

	Integer id;
	String name;
	double price;

	public Product() {

	}

	public Product(Integer id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<>();

		productList.add(new Product(1, "hp", 10000));
		productList.add(new Product(2, "dell", 12000));
		productList.add(new Product(3, "apple", 100000));
		productList.add(new Product(4, "onePluse", 30000));
		productList.add(new Product(5, "leneovo", 15000));

		productList.stream().filter(product -> product.price == 12000)
				.forEach(product -> System.out.println(product.name));

	}

}
