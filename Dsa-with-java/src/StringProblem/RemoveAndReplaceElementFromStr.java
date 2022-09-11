package StringProblem;

public class RemoveAndReplaceElementFromStr {

	public static void main(String[] args) {

		String str = "abcdemn35552opqrst@%";

		removeChar(str);

	}

	private static void removeChar(String str) {

		String s1 = str.replace("a", "");
		System.out.println(s1);

		String s2 = s1.replaceAll("[0-9 @ %]", "M");
		System.out.println(s2);

	}

}
