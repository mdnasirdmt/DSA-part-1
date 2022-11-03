package collectionProblem;

import java.util.HashMap;

public class Hasmap {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 3, 5, 6, 7, 6, 5, 4, 3, 2, 1 };
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (hm.get(arr[i]) == null) {
				hm.put(arr[i], 1);
			} else {
				int j = hm.get(arr[i]);
				hm.put(arr[i], ++j);
			}
		}
		System.out.println(hm);

	}

}
