package javaCollections;

import java.util.Stack;

public class javaStack {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<>();

		st.add(4);
		st.add(2);
		st.add(1);
		st.add(5);
		st.add(3);

		System.out.println(st);

//		System.out.println(st.pop());
//
//		System.out.println(st);
//		
//		System.out.println(st.empty());
////		st.clear();
//		st.push(6);
//		System.out.println(st);
		
		System.out.println(st.search(7));
		
		System.out.println(st.peek());
		
		
		
		
	}

}
