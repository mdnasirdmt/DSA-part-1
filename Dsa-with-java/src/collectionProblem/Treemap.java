package collectionProblem;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 4, 6, 3, 2 };
		Character[] ch = { 'a', 'b', 'c', 'd', 'e', 'f' };

		TreeMap<Integer, Character> tm = new TreeMap<Integer, Character>();
		for (int i = 0; i < arr.length; i++)
			tm.put(arr[i], ch[i]);
		System.out.println(tm);

	}

}
