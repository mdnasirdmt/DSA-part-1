package ArrayProblem;

import java.util.Arrays;

public class ReverseArr {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		
		String bag = "";
		for (int i = arr.length - 1; i >= 0; i--) {

			bag += arr[i] + " ";
		}
		

		System.out.println(bag);
		
	}
}
