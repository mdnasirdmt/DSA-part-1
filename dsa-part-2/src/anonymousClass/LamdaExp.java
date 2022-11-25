package anonymousClass;

interface lamda{
	int fun(int x);
}

public class LamdaExp {

	public static void main(String[] args) {
		
		lamda l1= (i) -> { 
			System.out.println("hi");
			return i;
		};
		
		System.out.println(l1.fun(10));
		
	
		}
	
	

}
