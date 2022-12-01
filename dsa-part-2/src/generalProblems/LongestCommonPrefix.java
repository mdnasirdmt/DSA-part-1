package generalProblems;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] arr = { "flowers", "flow", "flax", "flop" };
//		String[] arr= {"car","cycle","flax","watch"};

		String one = arr[0];
		String ans = "";

		for (int i = 1; i < arr.length; i++) {
			ans = "";
			for (int j = 0; j < Math.min(arr[i].length(), one.length()); j++) {
				if (arr[i].charAt(j) == one.charAt(j)) {
					ans += one.charAt(j);

				} else {
					break;
				}
			}
			one = ans;
		}

		System.out.println(ans);

	}

}

/*
 * 
 * 1st input will return common as "fl" 2nd input will return "" bcz in 2nd
 * there is no any common prefix
 * 
 */
