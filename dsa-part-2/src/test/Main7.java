package test;

public class Main7 {

	public static void main(String[] args) {
	
		Bike b= new Bike();
//		b.f1("hh");
//		b.f3();
		
		Bike b1= new Pulsur();
		
//		b1.f1("jj");
//		b1.f3();
//		
		
		Pulsur p1= (Pulsur)b1;
		p1.f2("aaaa");

	}

}

class Bike {


	void f1(String s) {
		System.out.println("f1 Bike");
	}
//	static void f1(Object o) {
//		System.out.println("obj a");
//	}
	
	void f3() {
		System.out.println("Bike  meth");
	}

}

class Pulsur extends Bike {

	void f1(String s) {
		System.out.println("Pulsur f1");
	}
	
	 void f2(Object o) {
		System.out.println("Pulsur f2");
	}
	
	void f3() {
		System.out.println("Pulsur meth");
	}
}

