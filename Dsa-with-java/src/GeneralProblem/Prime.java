package GeneralProblem;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("enter numer");
		int n=s.nextInt();
		

		if (n == 2)
			System.out.println("prime");
		
		else {
			boolean b=false;
			
			for(int i=2; i<=n/2; i++) {
				if(n%i==0) {
					b=true;
				}
			}
			
			if(b==false)
				System.out.println("Prime");
			else
				System.out.println("not prime");
		}
			
	}
}
