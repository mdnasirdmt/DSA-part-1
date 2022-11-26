package generalProblems;

public class EvenWithoutModulus {

	public static void main(String[] args) {
		
		int x=10;
		int i= x&1;
		
		System.out.println(i);
		if(i == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}

	}

}
