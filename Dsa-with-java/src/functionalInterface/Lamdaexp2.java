package functionalInterface;

interface Intr1{
	
	int fun1(int id);
}

public class Lamdaexp2 {

	public static void main(String[] args) {
		
		Intr1 i1= (id)->{
			return 101;
			
		};
		System.out.println("id is - > "+i1.fun1(101));
		
	}

}
