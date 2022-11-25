package anonymousClass;


interface Intr{
	void fun();
}

public class InnerClass {

	public static void main(String[] args) {
		
		Intr i1= new Intr(){
			public void fun() {
				System.out.println("hello");
			}
		};
		
		i1.fun();
	}

}
