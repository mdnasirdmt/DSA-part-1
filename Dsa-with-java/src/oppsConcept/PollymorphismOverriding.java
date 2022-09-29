package oppsConcept;

public class PollymorphismOverriding {

	public static void main(String[] args) {

		Bike b= new Splendor();
		b.run();
		
//		Splendor s= (Splendor) new Bike(); //it will give error
//		b.run();
		
		Splendor s= new Splendor();
		s.run();
		
//		Bike b1= new Bike();
//		b1.run();
	}

}

class Bike {

	void run() {
		System.out.println("bike method");

	}
}

class Splendor extends Bike{
	
	void run() {
		System.out.println("splendor method");
	}
}