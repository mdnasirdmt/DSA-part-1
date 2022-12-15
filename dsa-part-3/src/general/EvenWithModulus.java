package general;

public class EvenWithModulus {

	public static void main(String[] args) {

		int x = 8;
		boolean f = (x / 2) * 2 == x;
		if ((x / 2) * 2 == x) {
			System.out.println("even - " + f);
		} else
			System.out.println("odd - " + f);

	}

}
