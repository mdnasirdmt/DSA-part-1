package generalProblems;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int n=123;
		
		int rev=0;
		int rem=0;
		int t=n;
		while(n>0) {
			
			rev=rev*10+ n%10;
			
			n=n/10;
		}
		
		
			System.out.println(rev+" reversed number");
	

	}

}
