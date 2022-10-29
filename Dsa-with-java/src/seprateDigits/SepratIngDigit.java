package seprateDigits;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class SepratIngDigit {

	public static void main(String[] args) {

		int n = 950;

		seprate(n);
	}

	private static void seprate(int n) {

		LinkedList<Integer> stack = new LinkedList<Integer>();
//		Stack<Integer> stack = new Stack<>();
//		ArrayList<Integer> stack= new ArrayList<>();
		while (n > 0) {
			stack.push(n % 10);
//			stack.add(n%10);
			n = n / 10;
		}
		System.out.println(stack);

//		while (!stack.isEmpty()) {
//		    System.out.print( stack.pop()+" ");
//		   
//		}
	}

}
