package mapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {
		
		int[] arr= {0,1,3,4,1,2,3,1,0};
		HashMap<Integer, Integer>hm= new HashMap<>();
		
		for(int i=0; i<arr.length;i++) {
			if(hm.get(arr[i])==null) {
				hm.put(arr[i], 1);
			}else {
				int j= hm.get(arr[i]);
				hm.put(arr[i], ++j);
			}
		}
			System.out.println(hm);
			
			Set<Map.Entry<Integer,Integer>> v= hm.entrySet();
			
			for(Map.Entry<Integer, Integer> val:v) {
				if(val.getValue()>1) {
					
					System.out.print(val.getKey()+" ");
				}
			}
	}

}
