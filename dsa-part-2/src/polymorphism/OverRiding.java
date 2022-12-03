package polymorphism;

public class OverRiding {

	public static void main(String[] args) {

		Child c1 = new Child();
//		System.out.println(c1.method(10));
//		c1.childFun();
//		c1.parrentFun();
		

		Parrent p1 = new Parrent();
//		System.out.println(p1.method(5));
//		p1.parrentFun();

		Parrent p2 = new Child();
//		System.out.println(p2.method(5));
//		p2.parrentFun();
		

		Child c2 = (Child) p2;
		Child c3 = (Child) c1;
//		c2.childFun(); // specific method of child class by type casting
//		c3.childFun(); // specific method of child class by type casting

//		System.out.println(c2.method(5));
//		c2.parrentFun();
//		c3.childFun();
//		c3.method(10);

//		Riding riding2= new Test(); //Type mismatch: cannot convert from Test to Riding

	}

}

class Parrent {

	int method(int i) {

		System.out.println("Parrent method ");

		return i + 10;
	}

	void parrentFun() {
		System.out.println("Parrent fun method");
	}

	
}

class Child extends Parrent {

	int method(int i) {

		System.out.println("Child method ");

		return i + 20;
	}

	void childFun() {
		System.out.println("Child specific  fun method");
	}

}