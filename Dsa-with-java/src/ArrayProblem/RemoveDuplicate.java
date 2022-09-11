package ArrayProblem;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 4, 5 };

		Set<Integer> al = new LinkedHashSet<>();

		for (int i = 0; i < arr.length; i++)
			al.add(arr[i]);

		System.out.println(al);

	}

}
