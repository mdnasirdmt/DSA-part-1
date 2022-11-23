package pattrenOfStar;

public class Pattren2 {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 5; i++) {
			String bag="";

			for (int j = 1; j <=5; j++) {
				
				bag+=j+" ";
			}
			for(int k=5;k>=1;k--) {
				bag+=k+" ";
			}
			System.out.println();
			System.out.print(bag);
		}
	}

}
