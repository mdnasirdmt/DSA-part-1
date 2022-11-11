package functionalInterface;
@FunctionalInterface
interface Intr12 {
	int sayHello1(String name,String name1);
}
@FunctionalInterface
interface Intr {
	void sayHello(String name,String name1);
}

public class LamdaExpr {

	public static void main(String[] args) {

		Intr i1 = (name,name1) -> {
			System.out.println("Welcome " + name+" "+name1);
		};

		i1.sayHello("Nasir", "Hussain");
		
		
		
		Intr12 i12 = (name,name1) -> {
			System.out.println("Welcome " + name+" "+name1);
			return 101;
		};
		
		System.out.println(i12.sayHello1("Nasir", "Hussain"));
	}

}




