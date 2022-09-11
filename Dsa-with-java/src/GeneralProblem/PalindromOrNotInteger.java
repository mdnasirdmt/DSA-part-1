package GeneralProblem;

public class PalindromOrNotInteger {

	public static void main(String[] args) {
		
		int n=121;
		
		palindrom(n);
		
	}

	private static void palindrom(int n) {
		
		int n1=n, rem=0, num=0;
		
		while(n>0) {
			
			rem= n%10;
			num=num*10+rem;
			n=n/10;
		}
		
		if(n1==num) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

//	private static void palindrom(int n) {
//		
//		String s2= String.valueOf(n);
//		String s1=new StringBuilder(s2).reverse().toString();
//		
//		
//		if(s1.equals(s2)) {
//			
//			System.out.println("yes");
//		}else {
//			System.out.println("no");
//		}
//		
//	}
}
