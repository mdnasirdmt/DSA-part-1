package streamApi;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProductReduce {

	String name;
	double price;

	public ProductReduce() {

	}

	public ProductReduce(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {

		ArrayList<ProductReduce> productList = new ArrayList<ProductReduce>();
		productList.add(new ProductReduce("hp", 10000));
		productList.add(new ProductReduce("dell", 12000));
		productList.add(new ProductReduce("apple", 100000));
		productList.add(new ProductReduce("onePluse", 30000));
		productList.add(new ProductReduce("leneovo", 15000));

		// using collectors
		double totalPrice = productList.stream().collect(Collectors.summingDouble(product -> product.price));

		System.out.println(totalPrice);

		// using reduce
		double tprice = productList.stream().map(product -> product.price).reduce(0.0, (sum, price) -> sum + price);

		System.out.println(tprice);

	}

}
