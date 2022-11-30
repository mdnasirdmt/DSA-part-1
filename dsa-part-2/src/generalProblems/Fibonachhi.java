package generalProblems;

public class Fibonachhi {

	public static void main(String[] args) {

//		1st approuch

//		int n = 0, n1 = 1, n2 = 0;
//
//		System.out.print(n + " " + n1);
//
//		for (int i = 2; i <= 10; i++) {
//
//			n2 = n + n1;
//			System.out.print(" " + n2);
//			n = n1;
//			n1 = n2;
//
//		}

//		2nd appprouch

		int n = 10;

		System.out.println(findFib(n));

	}

	private static int findFib(int n) {

		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;

		}
		return	findFib(n-1)+findFib(n-2);
		 

	}

}
