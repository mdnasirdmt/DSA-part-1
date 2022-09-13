package oppsConcept;

public class Inheritance_oops {

	public static void main(String[] args) {

		///// from parrent class object
		System.out.println("from parrent class object ");
		Bicycle b = new Bicycle(2, 59);
		System.out.println(b.toString());

		System.out.println();

		////// from child class object
		System.out.println("from child class object");
		MountainBike mb = new MountainBike(3, 100, 25);
		System.out.println(mb.toString());

	}

}

/////////////
//Java program to illustrate the
//concept of inheritance

//base class
class Bicycle {
	// the Bicycle class has two fields
	public int gear;
	public int speed;

	// the Bicycle class has one constructor
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	// the Bicycle class has three methods
	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

	// toString() method to print info of Bicycle
	public String toString() {
		return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
	}
}

////////
//derived class
class MountainBike extends Bicycle {

	// the MountainBike subclass adds one more field
	public int seatHeight;

	// the MountainBike subclass has one constructor
	public MountainBike(int gear, int speed, int startHeight) {
		// invoking base-class(Bicycle) constructor
		super(gear, speed);
		seatHeight = startHeight;
	}

	// the MountainBike subclass adds one more method
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

	// overriding toString() method
	// of Bicycle to print more info
	@Override
	public String toString() {
		return (super.toString() + "\nseat height is " + seatHeight);
	}
}
///////////////////

/*
 * Inheritance is an important pillar of OOP(Object-Oriented Programming). It is
 * the mechanism in java by which one class is allowed to inherit the
 * features(fields and methods) of another class.
 * 
 * Important terminology:
 * 
 * Super Class: The class whose features are inherited is known as a
 * superclass(or a base class or a parent class). Sub Class: The class that
 * inherits the other class is known as a subclass(or a derived class, extended
 * class, or child class). The subclass can add its own fields and methods in
 * addition to the superclass fields and methods. Reusability: Inheritance
 * supports the concept of “reusability”, i.e. when we want to create a new
 * class and there is already a class that includes some of the code that we
 * want, we can derive our new class from the existing class. By doing this, we
 * are reusing the fields and methods of the existing class. How to use
 * inheritance in Java
 * 
 * The keyword used for inheritance is extends.
 * 
 * Syntax :
 * 
 * class derived-class extends base-class { //methods and fields }
 * 
 */
