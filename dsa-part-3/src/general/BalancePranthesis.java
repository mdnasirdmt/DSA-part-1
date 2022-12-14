package general;

public class BalancePranthesis {

	public static void main(String[] args) {

//		String s1 = "((()))"; //balance!
//		String s1="((())";    //not balance!
		String s1 = ")))((("; // not balance!

		int c = 0;
		boolean f = true;
		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == '(')
				c++;
			else
				c--;

			if (c < 0)
				f = false;
		}
//		System.out.println(c);

		if (c != 0)
			f = false;

		if (f)
			System.out.println("balance! ");
		else
			System.out.println("not balance! ");

	}

}
