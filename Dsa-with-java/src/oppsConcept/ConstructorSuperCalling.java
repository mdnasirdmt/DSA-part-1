package oppsConcept;

public class ConstructorSuperCalling {

	public static void main(String[] args) {
		Labrador labrador = new Labrador();
	}

}

class Animal {
	public Animal() {
		System.out.println("Animal Constructor");
	}
}

class Dog extends Animal {
	public Dog() {
		System.out.println("Dog Constructor");
	}
}

class Labrador extends Dog {
	public Labrador() {
		System.out.println("Labrador Constructor");
	}
}

/*
 * output
 * 
 * Animal Constructor 
 * Dog Constructor 
 * Labrador Constructor
 * 
 * 
 */

/*
 * Is a super class constructor called even when there is no explicit call from
 * a sub class constructor? What will be the output of below program ?
 * 
 */