package GeneralProblem;

public class HashCode {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("Testing");

		String s= str.toString();
		System.out.println(s);

		System.out.println(str.hashCode());

		if (str instanceof Object) {
			System.out.println("I extend Object");// Will be printed
		}
		if (s instanceof Object) {
			System.out.println("I extend Object");// Will be printed
		}
	}

}
