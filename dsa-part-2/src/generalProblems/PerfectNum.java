package generalProblems;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("eneter number ");
		int n = s.nextInt();

		int sum = 1;
		for (int i = 2; i <=n/2; i++)
			if (n % i == 0)
				sum += i;
		if (sum == n)
			System.out.println(n + " is perfect number " + sum);
		else
			System.out.println(n + " is not perfecr number ");

		System.out.println(n + " " + sum);
	}

}

/*
 * Write program weather the number is PERFECT NUMBER or not? Def: Perfect
 * number, a positive integer that is equal to the sum of its proper divisors.
 * The smallest perfect number is 6, which is the sum of 1, 2, and 3.
 */
