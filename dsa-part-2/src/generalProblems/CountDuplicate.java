package generalProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountDuplicate {

	public static void main(String[] args) {
		
		int[]arr= {4, 4, 5, 5, 6};
		
		HashMap<Integer, Integer> hm= new HashMap<>();
		
		for(int i=0; i<arr.length;i++) {
			
			if(hm.get(arr[i])==null) {
				hm.put(arr[i], 1);
			}else {
				
				int j=hm.get(arr[i]);
				
				hm.put(arr[i], ++j);
			}
		}
		
		System.out.println(hm);
		
		Set<Map.Entry<Integer,Integer>> eset= hm.entrySet();
		
		for(Map.Entry<Integer, Integer> i:eset){
			System.out.println(i.getKey()+"  "+i.getValue());
		}

	}

}
