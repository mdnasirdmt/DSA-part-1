package StringProblem;

public class SwapStrelementWithoutTemp {

	public static void main(String[] args) {

		String str = "abc";
		String str1 = "efgh";

		str = str + str1;
		System.out.println(str);
		str1 = str.substring(0, str.length() - str1.length());
		str = str.substring(str1.length());

		System.out.println("str " + str);
		System.out.println("str1 " + str1);

	}

}
