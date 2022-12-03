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
		
		System.out.println(ol.methode(1, 2));
		
		ol.methode("welcome");

	}

}
