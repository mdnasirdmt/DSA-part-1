package polymorphism;

public class OverRiding {

	public static void main(String[] args) {

		Riding riding = new Riding();
//		System.out.println(riding.method(10));
//		riding.fun();

		Test test = new Test();
//		test.method(5);
//		test.testFun();

		Test test2 = new Riding();
//		test2.method(15);
//		test2.testFun();

		Riding riding2 = (Riding) test2;
		Riding riding3 = (Riding) riding;
//		riding2.fun();  // specific method of child class by type casting
//		riding3.fun();	// specific method of child class by type casting

//		riding2.testFun();
//		riding3.testFun();

//		Riding riding2= new Test(); //Type mismatch: cannot convert from Test to Riding

	}

}

class Test {

	int method(int i) {

		System.out.println("Test method ");

		return i + 10;
	}

	void testFun() {
		System.out.println("test fun method");
	}
}

class Riding extends Test {

	int method(int i) {

		System.out.println("Riding method ");

		return i + 20;
	}

	void ridingFun() {
		System.out.println("riding specific  fun method");
	}

}