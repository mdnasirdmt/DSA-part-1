package javaCollections;

import java.util.Vector;

public class JavaVector {

	public static void main(String[] args) {
		
		Vector<Integer> v= new Vector<>();
		
		for(int i=0; i<=5; i++) {
			v.add(i);
		}
		v.add(9);
		v.add(8);
		v.add(7);
		
		System.out.println(v);
		
		
		System.out.println(v.subList(2, 5));
		
		v.add(0, null);
		System.out.println(v);
		
		v.set(1, 5);
		v.set(0, 3);
		System.out.println(v);
		
		v.remove(5);
		System.out.println(v);

		
	}

}
