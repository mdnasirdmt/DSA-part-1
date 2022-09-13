package oppsConcept;

public class OverLoading {

	public static void main(String[] args) {
		Bar x = new Bar();
		x.doIt("hello");
	}

}

class Foo {
	public void doIt(int number) {
		System.out.println("A");
	}

	public void doIt(String string) {
		System.out.println("B");
	}
}

class Bar extends Foo {
	public void doIt(float number) {
		System.out.println("C");
	}
}
