package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(5,5,2,2, 2, 3, 2, 4, 3, 1, 5, 6, 6, 7, 8,8,8));
		int[] arr = { 5, 2, 3, 2, 4, 3, 1, 5, 6, 6, 7, 8 };
		HashMap<Integer, Integer> hm = new HashMap<>();

//		using arraylist
		for (int i = 0; i < al.size(); i++) {

			if (hm.get(al.get(i)) == null) {
				hm.put(al.get(i), 1);
			} else {
				int j = hm.get(al.get(i));
				hm.put(al.get(i), ++j);
			}

		}

//		using array
//		for (int i = 0; i < arr.length; i++) {
//
//			if (hm.get(arr[i]) == null) {
//				hm.put(arr[i], 1);
//			} else {
//				int j = hm.get(arr[i]);
//				hm.put(arr[i], ++j);
//			}
//
//		}

//		System.out.println(al);
		System.out.println(hm);
		
		Set<Map.Entry<Integer, Integer>> entry= hm.entrySet();
		
		for(Map.Entry<Integer, Integer> i :entry){
			
			if(i.getValue()>1) {
				System.out.println(i.getKey()+"="+ i.getValue());
			}
		}

	}

}
