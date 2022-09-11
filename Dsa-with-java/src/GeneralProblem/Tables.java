package GeneralProblem;

public class Tables {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 2; i <= n; i++) {

			for (int j = 1; j <= 10; j++) {

				System.out.println(j + "*" + i + " = " + j * i + " ");

			}
		}
	}

}
