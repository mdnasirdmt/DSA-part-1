package javaCollections;

import java.util.ArrayList;
import java.util.ListIterator;

public class JavaIterator {
	
	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<>();
		
		list.add("abc");
		list.add("def");
		list.add("ghi");
		list.add("jkl");
		list.add("mno");
		
		ListIterator<String> itr= list.listIterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println(itr.hasPrevious()+" ");
		
	}

}
