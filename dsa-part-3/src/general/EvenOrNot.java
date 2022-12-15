package general;

public class EvenOrNot {

	public static void main(String[] args) {

		int x = 8;

		boolean f = true;

		for (int i = 1; i <= x; i++) {
			f = !f;
		}

		if (f) {
			System.out.println("even " + f);
		} else
			System.out.println("odd " + f);

	}

}
