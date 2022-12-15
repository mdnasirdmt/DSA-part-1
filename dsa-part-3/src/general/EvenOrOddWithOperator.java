package general;

public class EvenOrOddWithOperator {

	public static void main(String[] args) {

		int x = 81;

		int n = x & 1;

		if (n == 0)
			System.out.println("even - " + n);
		else
			System.out.println("odd - " + n);

	}

}
