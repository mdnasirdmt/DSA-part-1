package test;

public class Main {

	public static void main(String[] args) {
		
		a o1= new a();
//		o1.f1(new String("Nemisa"));
//		o1.f1(new StringBuffer("hq"));
		
		a.f1(new StringBuilder("nimesha"));

//		Integer a=10; //ArithmeticException
//		Integer a= null; // NullPointerException:
//		Integer b=0;
//		Integer c= a/b;
//		System.out.println(c);
		
	
	}

}

class a {
//	System.out.println("class a");
//	System.out.print("h");
//	a() {
//		System.out.println("class a");
//	}

	void f1(String s) {
		System.out.println("f1 a");
	}
	static void f1(Object o) {
		System.out.println("obj a");
	}

}

class b extends a {
//	b() {
//		System.out.println("class b");
//	}

//	void f1() {
//		System.out.println("f1 b");
//	}
	
	void f1(String s) {
		System.out.println("f1 b");
	}
	static void f1(Object o) {
		System.out.println("obj b");
	}
}

//abstract class A {
//	public abstract void method1();
//
//	protected abstract void  method2() {
//		  System.out.println("method2");
//		  }
//
//	abstract void method3();
//
//	private void method4() {
//		System.out.println(" method4");
//	}
//}