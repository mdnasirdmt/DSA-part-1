package mapInterface;

import java.util.LinkedHashMap;

public class JavaLinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lhm= new LinkedHashMap<>();
		
//		lhm.put("def", 3);
//		lhm.put("abc", 1);
//		lhm.put("ghi", 2);
//		
//		System.out.println(lhm);
//		
//		lhm.replace("ghi", 5);
//		System.out.println(lhm);
//		
//		lhm.replace("abc", 1, 7);
//		System.out.println(lhm);
		
		String[] str= {"a","b","c","d","b","a","c"};
		LinkedHashMap<String, Integer> lhm2= new LinkedHashMap<>();
		for(int i=0;i<str.length; i++) {
			
			if(lhm2.get(str[i])==null) {
				lhm2.put(str[i], 1);
			}else {
				int j=lhm2.get(str[i]);
				lhm2.put(str[i], ++j);
			}
			
		}
		System.out.println(lhm2);

	}

}
