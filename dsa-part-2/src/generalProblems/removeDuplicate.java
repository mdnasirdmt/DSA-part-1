package generalProblems;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicate {

	public static void main(String[] args) {
		
		String str= "geegsforgeeks";
		
		int n=str.length();
		
		LinkedHashSet<Character> hs= new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++) {
			hs.add(str.charAt(i));
		}
		
		System.out.println(hs);

	}

}
