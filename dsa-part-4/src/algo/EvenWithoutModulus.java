package algo;

public class EvenWithoutModulus {
	public static void main(String[] args) {

		int x = 12;

		int y = x & 1;
		if (y == 0)
			System.out.println("even");
		else
			System.out.println("odd");
	}

}
