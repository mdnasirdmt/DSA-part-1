package mapInterface;

import java.util.TreeMap;

public class JavaTreeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<>();
		
		String[] str= {"b","c","a","b","d","a","c"};
		
		for(int i=0;i<str.length;i++) {
			if(tm.get(str[i])==null) {
				tm.put(str[i], 1);
			}else {
				int j=tm.get(str[i]);
				tm.put(str[i], ++j);
			}
		}
		System.out.println(tm);

	}

}
