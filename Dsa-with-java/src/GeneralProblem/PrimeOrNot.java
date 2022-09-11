package GeneralProblem;

public class PrimeOrNot {

	public static void main(String[] args) {

		int n = 10;

		prim(n);
	}

	private static void prim(int n) {

		for (int i = 2; i <= n; i++) {

			int f = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					f++;
				}

			}

			if (f > 2) {

				System.out.println(i + " " + " not prime");

			} else {
				System.out.println(i + " " + "prime");
			}

		}

	}

}
