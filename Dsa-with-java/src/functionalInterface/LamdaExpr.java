package functionalInterface;

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
	}

}
