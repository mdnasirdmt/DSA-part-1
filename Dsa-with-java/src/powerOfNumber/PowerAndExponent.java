package powerOfNumber;

import java.util.Scanner;

public class PowerAndExponent {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int result = 1;
		System.out.print("enter base number : ");
		int base = s.nextInt();
		System.out.print("enter expo number : ");
		int expo = s.nextInt();

		while (expo != 0) {
			result *= base;
			expo--;
		}

		System.out.println(result);

	}

}
