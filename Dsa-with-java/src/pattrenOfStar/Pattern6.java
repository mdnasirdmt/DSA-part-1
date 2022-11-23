package pattrenOfStar;

public class Pattern6 {
	public static void main(String[] args) {



		for (int base = 1; base <= 20; base++) {

			int expo = 2;

			int result = 1;

			while (expo != 0) {
				result *= base;
				expo--;
			}
			System.out.print(result+" ");
		}
		
		System.out.println();

		for (int base = 1; base <= 20; base++) {

			int expo = 3;

			int result = 1;

			while (expo != 0) {
				result *= base;
				expo--;
			}
			System.out.print(result+" ");
		}

	}
}
