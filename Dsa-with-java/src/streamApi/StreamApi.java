package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {

		String s = "1,2,3,4,5";
		String[] s1 = s.split(",");

		int[] a = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();
		System.out.println(Arrays.toString(a));

	
		
		 // create a list of integers
	    List<Integer> number = Arrays.asList(2,3,4,5);
	    System.out.println(number);
	    
	    // demonstration of map method
	    List<Integer> square = number.stream().map(x -> x*x).
	                           collect(Collectors.toList());
	    System.out.println(square);

	}

}
