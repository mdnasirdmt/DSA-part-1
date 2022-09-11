package GeneralProblem;

public class swapTwoNumberWithoutTemp {

	public static void main(String[] args) {

		int x = 7;
		int y = 5;

		swap(x, y);

	}

	private static void swap(int x, int y) {

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("x " + x);
		System.out.println("y " + y);

	}

}
