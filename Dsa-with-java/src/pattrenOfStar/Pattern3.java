package pattrenOfStar;

public class Pattern3 {

	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			String bag="";

			for (int j = 5; j >=1; j--) {
				
				bag+=j+" ";
			}
			for(int k=1;k<=5;k++) {
				bag+=k+" ";
			}
			System.out.println();
			System.out.print(bag);
		}

	}

}
