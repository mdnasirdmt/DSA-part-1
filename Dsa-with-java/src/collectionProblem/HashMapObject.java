package collectionProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapObject {

	public static void main(String[] args) {

		Character[] ch = { 'b', 'a', 'd', 'c', 'e', 'f', 'a', 'd', 'b', 'f' };

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < ch.length; i++) {
			if (hm.get(ch[i]) == null) {

				hm.put(ch[i], 1);
			} else {

				int j = hm.get(ch[i]);
				hm.put(ch[i], ++j);

			}
		}
//		System.out.println(hm);
		
		
//		TreeMap<Character, Integer> tm= new TreeMap<Character, Integer>(hm);
//		System.out.println(tm);
		
		Set<Map.Entry<Character, Integer>> entries= hm.entrySet();
//		System.out.println(entries);
		
//		System.out.println(entries.toString());
		
		for(Map.Entry<Character, Integer> ent:entries){
			System.out.println(ent.getKey()+ "-> "+ ent.getValue());
		}

	}

}
