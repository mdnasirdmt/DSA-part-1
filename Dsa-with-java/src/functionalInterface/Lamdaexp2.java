package functionalInterface;

interface Intr1{
	
	int fun1(int id);
}

public class Lamdaexp2 {

	public static void main(String[] args) {
		// lamda exp
		Intr1 i1= (id)->{
			return 101;
			
		};
		System.out.println("id is - > "+i1.fun1(101));
		
		// inner class or anonymous class 
		Intr1 i2= new Intr1() {
			
			@Override
			public int fun1(int id) {
				return id*10;
			}
		};
		
		System.out.println(i2.fun1(10));
		
	}

}

//abstract class demo{
//	
//	abstract void fun();
//	void fun2() {
//		System.out.println("body method ");
//	}
//}
//interface demo1{
//	void fun1();
//	default void fun2() {
//		System.out.println("default");
//	}
//	static void fun3() {
//		System.out.println("static");
//	}
//}
