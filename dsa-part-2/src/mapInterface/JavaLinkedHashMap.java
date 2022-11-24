package mapInterface;

import java.util.LinkedHashMap;

public class JavaLinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lhm= new LinkedHashMap<>();
		
		lhm.put("def", 3);
		lhm.put("abc", 1);
		lhm.put("ghi", 2);
		
		System.out.println(lhm);
		
		lhm.replace("ghi", 5);
		System.out.println(lhm);
		
		lhm.replace("abc", 1, 7);
		System.out.println(lhm);

	}

}
