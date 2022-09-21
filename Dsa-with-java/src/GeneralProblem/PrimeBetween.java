package GeneralProblem;

import java.util.Scanner;

public class PrimeBetween {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter 1st and 2nd number ");
		int l=s.nextInt();
		int e=s.nextInt();
		
		System.out.println("prime between  "+l+" to  "+e);
		for(int i=l; i<=e; i++) {
			
		boolean b=	prime(i);
		
		
		if(b)
			System.out.print( i+" ");
		}

	}

	private static boolean prime(int i) {
		
		if(i==2)
			return true;
		
		else {
			boolean b=true;
			
			for(int j=2;j<=i/2; j++) {
				if(i%j==0) {
					b=false;
					break;
				}
			}
			return b;
		}
		
	}

}
