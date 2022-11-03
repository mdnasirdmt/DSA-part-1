package collectionProblem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Linkedhashmap {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 5, 4 };
		int[] arr1 = { 10, 20, 30, 40, 50 };
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
		for (int i = 0; i < arr1.length; i++) {

//			if(lhm.get(arr[i])==null) {
//				lhm.put(arr[i], 1);
//			}else {
//				int j=lhm.get(arr[i]);
//				lhm.put(arr[i], ++j);
//			}

			lhm.put(arr[i], arr1[i]);
		}

		System.out.println("linkedHashMap " + lhm);

		TreeMap<Integer, Integer> tm = new TreeMap<>(lhm);
		
		System.out.println("TreeMap "+tm);
		
		HashMap<Integer, Integer>hm= new HashMap<Integer, Integer>(lhm);
		System.out.println("HashMap "+hm);
		
		

	}

}
