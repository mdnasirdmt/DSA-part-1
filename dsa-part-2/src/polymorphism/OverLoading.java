package polymorphism;

public class OverLoading {

	void methode(String str) {
		System.out.println("methode " + str);
	}

	static int methode(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		OverLoading ol = new OverLoading();

		System.out.println(OverLoading.methode(1, 2));

		ol.methode("welcome");

	}

}

//Method overloading
//has nothing to do with return-type.
//If there are two methods of the same signature within a class in the program, 
//then Ambiguity Error comes, whether their return-type is different or not.
//This means that method overloading has no relation with return-type.
