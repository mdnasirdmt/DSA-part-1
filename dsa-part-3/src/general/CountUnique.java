package general;

import java.util.Arrays;

public class CountUnique {

	public static void main(String[] args) {

		int[] arr = { 1, 1,1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8,7,6 };
		
		Arrays.sort(arr);

		int j = 1;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i - 1] != arr[i])
				j++;

		}
		System.out.println(j);
		
		

	}

}
