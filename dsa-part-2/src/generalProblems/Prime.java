package generalProblems;

public class Prime {

	public static void main(String[] args) {
		
		int n=10;
		
		
		if(n==2) {
			System.out.println(n+ " is prime");
		}
		boolean f=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				f=false;
			}
			else {
				break;
			}
		}
		
		if(f) {
			System.out.println(n+" is prime");
		}else {
			System.out.println(n+" is not prime");
		}

	}

}
