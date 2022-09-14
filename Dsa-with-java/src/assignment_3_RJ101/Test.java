package assignment_3_RJ101;

public class Test {

	public static void main(String[] args) {

		Tomato tomato = new Tomato();
		tomato.hasRoot();
		tomato.hasPeel();

	}

}

interface Vegetable {

	void hasPeel();

}

interface Fruits {

	void hasRoot();

}

class Tomato implements Vegetable, Fruits {

	@Override
	public void hasRoot() {
		System.out.println("it is from vegetable interface ");

	}

	@Override
	public void hasPeel() {

		System.out.println("it is from fruits intetface ");

	}

}
