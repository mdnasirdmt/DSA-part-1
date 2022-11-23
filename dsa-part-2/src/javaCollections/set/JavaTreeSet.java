package javaCollections.set;

import java.util.TreeSet;

public class JavaTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts= new TreeSet<>();
		
		ts.add(1);
		ts.add(3);
		ts.add(4);
		ts.add(6);
		ts.add(5);
		ts.add(2);
		
		
		System.out.println(ts.ceiling(2));
		System.out.println(ts.floor(5));
		
		System.out.println(ts);
		System.out.println(ts.remove(5));
		System.out.println(ts);
	}

}
