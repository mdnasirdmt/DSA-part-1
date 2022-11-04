package streamApi;

import java.util.Arrays;

public class StreamApi {

	public static void main(String[] args) {

		String s = "1,2,3,4,5";
		String[] s1 = s.split(",");

		int[] a = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();

		System.out.println(Arrays.toString(a));

	}

}
