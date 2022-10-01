package ArrayProblem;

import java.util.*;

public class RemoveDuplicate2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 3, 4, 5, 6, 6, 7, 7 };

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

		for (int i = 0; i < arr.length; i++) {

			lhs.add(arr[i]);
		}
		System.out.println(lhs);

	}

}
