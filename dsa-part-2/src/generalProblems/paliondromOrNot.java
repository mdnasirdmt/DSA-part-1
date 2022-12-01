package generalProblems;

public class paliondromOrNot {

	public static void main(String[] args) {

		int n = 121;

		int t = n;

		int rev = 0;

		while (n > 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		if(rev==t) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
//		System.out.println(rev);
	}

}
