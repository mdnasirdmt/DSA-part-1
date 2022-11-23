package javaCollections.set;

import java.util.HashSet;

public class JavaSet {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs= new HashSet<>();
		
		hs.add(2);
		hs.add(1);
		hs.add(3);
		hs.add(5);
		hs.add(2); // duplicate not allowed
		hs.add(null);
		hs.add(4);
		System.out.println(hs);
		
		hs.remove(2);
		System.out.println(hs);
		
		System.out.println(hs.clone());
		
		
	}

}
