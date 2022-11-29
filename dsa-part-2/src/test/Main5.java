package test;

public class Main5 {

	public static void main(String[] args) {
		a11 o1= new a11();
//		o1.f1(new String("Nemisa"));
//		o1.f1(new StringBuffer("hq"));
//		a.f1(new StringBuilder("nimesha"));
//		o1.f2();
		
		
		
		
		a11  o2= new b1();
//		o2.f1(new String("Nemisa"));
//		o2.f1(new StringBuffer("hq"));
		

//		b1.f1(new StringBuilder("nimesha"));
//		b1 o3= new b1();
//		o3.f1("nnn");
//		o3.f2();
		

	}

}

class a11 {


	void f1(String s) {
		System.out.println("f1 a");
	}
	static void f1(Object o) {
		System.out.println("obj a");
	}
	
	void a11f2() {
		System.out.println("a11f2 of a11");
	}

}

class b1 extends a11 {

	void f1(String s) {
		System.out.println("f1 b");
	}
	static void f1(Object o) {
		System.out.println("obj b");
	}
	
	void b1f2() {
		System.out.println("b1f2 of a11");
	}
}

