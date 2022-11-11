package streamApi;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Product {

	String name;
	double price;

	public Product() {

	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {

		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(new Product("hp", 10000));
		productList.add(new Product("dell", 12000));
		productList.add(new Product("apple", 100000));
		productList.add(new Product("onePluse", 30000));
		productList.add(new Product("leneovo", 15000));

		// using collectors total price
		double totalPrice = productList.stream().collect(Collectors.summingDouble(product -> product.price));
		System.out.println(totalPrice);

		// using reduce total price
		double tprice = productList.stream().map(product -> product.price).reduce(0.0, (sum, price) -> sum + price);
		System.out.println(tprice);
		
		
		//max price
		Product p1=productList.stream().max((product1,product2)-> product1.price>product2.price?1:-1).get();
		System.out.println(p1.price);
		
		//min price
		Product p2= productList.stream().min((product1,product2)-> product1.price>product2.price?1:-1).get();
		System.out.println(p2.price);
		
		
		//using filter
		productList.stream().filter(product -> product.price == 12000)
		.forEach(product -> System.out.println(product.name));

	}

}
