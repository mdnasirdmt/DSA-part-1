package collectionProblem;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapKeyValue {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		char[] c = { 'a', 'b', 'c', 'd', 'e' };

		HashMap<Integer, Character> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			hm.put(arr[i], c[i]);
		}
//		System.out.println(hm);

		Set<Map.Entry<Integer, Character>> entries = hm.entrySet();
		System.out.println(" key value pair " + entries);

		Set<Integer> keyset = hm.keySet();
		System.out.println("key " + keyset);

		Collection<Character> value = hm.values();
		System.out.println(value);

		Character q = hm.get(1);
		System.out.println(q);
	}

}
