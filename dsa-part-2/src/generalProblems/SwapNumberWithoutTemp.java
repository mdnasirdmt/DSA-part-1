package generalProblems;

public class SwapNumberWithoutTemp {

	public static void main(String[] args) {

		int x = 12;
		int y = 8;

		x = x + y;

//		System.out.println("x+y = "+x);

		y = x - y;
		System.out.println("y = " + y);
//		System.out.println(x);
		x = x - y;
		System.out.println("x = " + x);

	}

}
