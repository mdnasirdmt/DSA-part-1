package GeneralProblem;

public class PalindromOrNotString {

	public static void main(String[] args) {

		String str = "raccar";

		palindrom(str);

	}

	private static void palindrom(String str) {

		String s = new StringBuilder(str).reverse().toString();
		if (s.equals(str)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

	// Approuch-1
//	private static void palindrom(String str) {
//		
//		String bag="";
//		for(int i=str.length()-1; i>=0; i--) {
//			bag+=str.charAt(i);
//		}
//		
//		if(str.equals(bag)) {
//			System.out.println("String is palindrom");
//		}
//		else {
//			System.out.println("not palindrom");
//		}
//		
//	}

}
