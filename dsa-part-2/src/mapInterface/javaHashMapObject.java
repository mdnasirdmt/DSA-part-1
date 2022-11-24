package mapInterface;

import java.util.HashMap;

public class javaHashMapObject {

	public static void main(String[] args) {

		Integer[] arr = { 101, 501, 201, 301, 401, 501, 201, 101, 301, 101 };

		HashMap<Integer, Integer> hm = new HashMap<>();

		// using forloop counting values

//		for(int i=0; i<arr.length;i++) {
//			
//			if(hm.get(arr[i])==null) {
//				hm.put(arr[i], 1);
//			}else {
//				Integer j= hm.get(arr[i]);
//				hm.put(arr[i], ++j);
//			}
//			
//		}
//		System.out.println(hm);

		// using getorDefault
		for (int i = 0; i < arr.length; i++) {

			if (hm.get(arr[i]) == null) {
				hm.put(arr[i], 1);

			}else {
				int k = hm.getOrDefault(arr[i], 1);
				hm.put(arr[i], ++k);
			}

		}
		System.out.println(hm);
	}

}
