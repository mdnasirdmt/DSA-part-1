package StringProblem;

public class ReverseStr {

	public static void main(String[] args) {
		
		String str= "qwerty";
		
	String s=	reverseStr(str);
	
	System.out.println(s);

	}

	private static String reverseStr(String str) {
		
		String str1= new StringBuilder(str).reverse().toString();
		
		return str1;
	}

}
