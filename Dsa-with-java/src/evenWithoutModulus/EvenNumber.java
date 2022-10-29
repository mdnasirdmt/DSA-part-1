package evenWithoutModulus;

public class EvenNumber {

	public static void main(String[] args) {

		int n = 10;

		evenCheck(n);

	}

	private static void evenCheck(int n) {

//		System.out.println(n&1);
		int i = n & 1;

		if (i == 0)
			System.out.println("even ");
		else
			System.out.println("odd ");

//		System.out.println(i);

	}

}
