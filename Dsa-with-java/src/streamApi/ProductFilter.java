package streamApi;

import java.util.ArrayList;

public class ProductFilter {

	Integer id;
	String name;
	double price;

	public ProductFilter() {

	}

	public ProductFilter(Integer id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		ArrayList<ProductFilter> productList = new ArrayList<>();

		productList.add(new ProductFilter(1, "hp", 10000));
		productList.add(new ProductFilter(2, "dell", 12000));
		productList.add(new ProductFilter(3, "apple", 100000));
		productList.add(new ProductFilter(4, "onePluse", 30000));
		productList.add(new ProductFilter(5, "leneovo", 15000));

		productList.stream().filter(product -> product.price == 12000)
				.forEach(product -> System.out.println(product.name));

	}

}
