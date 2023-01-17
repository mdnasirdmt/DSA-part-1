package algo;

public class BalanceParanthesis {
	
	public static void main(String[] args) {
		
		
		String str="((()))";
//		String str="((())";
//		String str=")))(((";
		
		boolean b= balanceParanthesis(str);
		
		if(b) {
			System.out.println("Balanced !");
		}else {
			System.out.println("Not balanced !");
		}
	}

	private static boolean balanceParanthesis(String str) {
		int c=0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='(') {
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
		}else {
			return false;
		}
		
	}

}
