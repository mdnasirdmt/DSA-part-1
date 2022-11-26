package generalProblems;

public class balanceParanthesis {

	public static void main(String[] args) {
		
		String str="(())";
//		String str="((())";
//		String str="))((";
			
		int c=0;
		boolean f= true;
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)=='(') {
				c++;
			}else {
				c--;
			}
			
			if(c<0) {
				f=false;
			}
			
		}
		
		if(c!=0)
			f= false;
		
		if(f) {
			System.out.println("balanced ");
		}else {
			System.out.println("not balanced");
		}

	}

}
