package string;

public class BalancePranthesis {

	public static void main(String[] args) {
		
//		String s1 = "((()))"; //balance!
//		String s1="((())";    //not balance!
//		String s1 = ")))((("; // not balance!
		String s1 = "(()))(()"; // not balance!
		
		if(pranthesis(s1)) {
			System.out.println("Balanced !");
		}else {
			System.out.println("Not Balanced !");
		}

	}

	private static boolean pranthesis(String s1) {
		
		int c=0;
		
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			
			if(ch=='(') {
				c++;
			}else {
				c--;
			}
			
			if(c<0) {
				return false;
			}
			
		}
		if(c==0) {
			return true;
		}
		return false;
		
		
	}
	
	

}
