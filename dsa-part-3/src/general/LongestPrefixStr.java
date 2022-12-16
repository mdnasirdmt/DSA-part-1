package general;

public class LongestPrefixStr {

	public static void main(String[] args) {

		String[] str = { "flower", "flow", "flight" };
//		String[]str= {"apple","flow","book"};

		String s = str[0];
		String ans = "";

		for (int i = 0; i < str.length; i++) {

			ans = "";
			for (int j = 0; j < Math.min(s.length(), str[i].length()); j++) {

				if (s.charAt(j) == str[i].charAt(j)) {
					ans += s.charAt(j);
				} else {
					break;
				}
			}
			s = ans;
		}
		System.out.println(ans);

	}

}
