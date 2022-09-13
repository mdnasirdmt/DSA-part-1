package oppsConcept;

public class Construction2 {

	public static void main(String[] args) {

		Animal1 a = new Animal1("tiger");
		System.out.println(a.name);

		Animal1 b = new Animal1();
		System.out.println(b.name);

	}

}

class Animal1 {

	String name;

	public Animal1() {
		this.name = "Lion";

	}

	public Animal1(String name) {
		this.name = name;
	}

}
