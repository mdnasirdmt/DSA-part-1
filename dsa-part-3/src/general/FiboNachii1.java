package general;

public class FiboNachii1 {

	public static void main(String[] args) {

		int n = 10;
		int x = 0;
		int y = 1;

		int z = 0;

		System.out.print(x + " " + y);

		while (n >= 2) {

			z = x + y;
			System.out.print(" " + z);
			x = y;
			y = z;
			n--;

		}

	}

}
