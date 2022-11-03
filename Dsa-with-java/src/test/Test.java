package test;

public class Test {

	public static void main(String[] args) {

		String str = "md nasir uddin";
		// M.N.U

		String[] strArry = str.split(" ");

		String bag = "";
		for (int i = 0; i < strArry.length; i++) {
			if (i == strArry.length - 1)
				bag += strArry[i].charAt(0);
			else
				bag += strArry[i].charAt(0) + ".";

		}

		System.out.println(bag.toUpperCase());

	}

}
