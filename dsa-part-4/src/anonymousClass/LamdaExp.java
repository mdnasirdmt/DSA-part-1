package anonymousClass;

import java.util.ArrayList;
import java.util.stream.Stream;

public class LamdaExp {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);

		// way 1
//		list.forEach((n)-> System.out.println("number is "+ n));

		// way 2
//		list.stream().forEach((n)-> System.out.println("number is "+ n));

		// way 3
//		list.stream().filter((n)->  n%2==0).forEach(System.out::println);

		// way 4
//		list.stream().forEach((n) -> {
//
//			if (n % 2 == 0) {
//				System.out.println(n);
//			}
//		});

		
		//way 5
		list.forEach((n) -> {

			if (n % 2 == 0) {
				System.out.println(n);
			}
		});

	}

}

//Lambda expressions basically express instances of functional interfaces (An interface with single abstract method is called functional interface. 
//An example is java.lang.Runnable). lambda expressions implement the only abstract function and therefore implement functional interfaces
//
//lambda expressions are added in Java 8 and provide below functionalities.
