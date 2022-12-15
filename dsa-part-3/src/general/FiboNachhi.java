package general;

public class FiboNachhi {

	public static void main(String[] args) {

		int y = 10;

		int x = fib(y);

		System.out.println(x);

	}

	private static int fib(int x) {

		if (x == 0)
			return 0;
		if (x == 1)
			return 1;

		return fib(x - 1) + fib(x - 2);

	}

}
