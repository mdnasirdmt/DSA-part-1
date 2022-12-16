package general;

import java.util.Stack;

public class PranthesisProblem {

	public static void main(String[] args) {

//		String str = "(){}[]";
//		String str= "({]";
//		String str= "()({}[]";
		String str = "({[]})";

		Stack<Character> s = new Stack<>();
		boolean f = true;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
				s.push(str.charAt(i));
			} else {
				if (str.charAt(i) == ')') {
					if (s.isEmpty() || s.pop() != '(')
						f = false;
				}
				if (str.charAt(i) == ']') {
					if (s.isEmpty() || s.pop() != '[')
						f = false;
				}
				if (str.charAt(i) == '}') {
					if (s.isEmpty() || s.pop() != '{')
						f = false;
				}
			}
		}
		if (s.isEmpty())
			System.out.println("balanced! ");
		else
			System.out.println("not balanced! ");

	}

}
