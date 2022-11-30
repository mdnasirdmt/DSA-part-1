package generalProblems;

public class FindFactorial {

	public static void main(String[] args) {

		int n = 5;
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f *= i;
		}
		System.out.println("factoril of " + n+" is  " + f);

	}

}
