package evenWithoutModulus;

public class EvenOdd {

	public static void main(String[] args) {

		int n = 7;

		boolean f = true;

		for (int i = 0; i < n; i++) {

			f = !f;

		}

		if (f) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}
