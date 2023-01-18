package algo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountElement {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 2, 4, 6, 8, 7, 7 };

		Map<Integer, Integer> hashMap = new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) {


			if (hashMap.get(arr[i]) == null) {

				hashMap.put(arr[i], 1);
				
			} else {
				
				int j = hashMap.get(arr[i]);
				hashMap.put(arr[i], ++j);
			}

		}
		
		System.out.println(hashMap);
		
		Set<Map.Entry<Integer, Integer>> entry=  hashMap.entrySet();
		
		for(Entry<Integer, Integer> i: hashMap.entrySet()) {
			
			System.out.println(i.getKey()+ " "+ i.getValue());
		}
		
		

	}

}
