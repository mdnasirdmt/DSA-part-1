package questions;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {

//		String s = "(())";
//		String s="(()))";
		String s=")))(((";

		boolean b = balnceParanthesis(s);
		if (b)
			System.out.println("balanced ");
		else
			System.out.println("not balanced ");
	}

	private static boolean balnceParanthesis(String s) {
		Stack<Character> ch = new Stack<Character>();
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				c++;
			else
				c--;

			if (c < 0)
				return false;

		}
		if (c != 0)
			return false;
		else if (c > 0)
			return false;

		return true;

	}

}
