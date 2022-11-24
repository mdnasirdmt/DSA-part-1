package mapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaHashMap {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "abc");
		hm.put(2, "def");
		hm.put(3, "abc");
		hm.put(4, "ghi");
		hm.put(4, "pqr");
		
		Set<Map.Entry<Integer, String>> eSet = hm.entrySet();
		
		boolean f=hm.containsKey(1);
		System.out.println(f);
		
		boolean f1= hm.containsValue("abca");
		System.out.println(f1);
		
		System.out.println(hm);
		
		System.out.println(eSet);

		// entry set
		for (Map.Entry<Integer, String> set : eSet) {
			System.out.println(set.getKey() + "--" + set.getValue());
		}
		
		//keySet
		Set<Integer> keySet= hm.keySet();
		System.out.println(keySet);
		
		
		//values
		System.out.println(hm.get(1));
		
//		values Set
		Collection<String> value=	hm.values();
		System.out.println(value);

		hm.remove(4);
		System.out.println(hm);

	}

}
