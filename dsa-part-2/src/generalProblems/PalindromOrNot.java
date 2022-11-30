package generalProblems;

import java.util.Scanner;

public class PalindromOrNot {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter number ");
		int n = s.nextInt();

		int n1 = n, rev = 0;
		while (n > 0) {

			rev = rev * 10 + n % 10;

			n = n / 10;

		}
		if (rev == n1)
			System.out.println(n1 + " palindrome");
		else
			System.out.println(n1 + " not palindrom ");

	}

}
