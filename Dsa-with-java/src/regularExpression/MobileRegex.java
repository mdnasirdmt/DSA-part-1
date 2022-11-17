package regularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileRegex {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter mobile number ");
		String mob= s.next();
		boolean p= Pattern.matches("[6789]{1}[0-9]{9}", mob);
		
		if(p==false) {
			System.out.println("invalid mobile number ");
		}
		
		
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true

	}

}
