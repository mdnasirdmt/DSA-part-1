package generalProblems;

public class RomanToInt {

	public static void main(String[] args) {

		String str = "viii";

		int n = romanToInt(str);
		System.out.println("int value is " + n);
	}

	private static int romanToInt(String str) {

		int num = 0, ans = 0;

		for (int i = str.length() - 1; i >= 0; i--) {

			switch (str.charAt(i)) {

			case 'I':
				num = 1;
				break;

			case 'V':
				num = 5;
				break;

			case 'X':
				num = 10;
				break;

			case 'L':
				num = 50;
				break;

			case 'C':
				num = 100;
				break;

			case 'D':
				num = 500;
				break;

			case 'M':
				num = 1000;
				break;

			}

			if (num * 4 < ans)
				ans -= num;
			else
				ans += num;

//			System.out.println(ans);
//			System.out.println(num);
		}
		return ans;
	}
}