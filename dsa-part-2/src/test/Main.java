package test;

public class Main {

	public static void main(String[] args) {

		a o1= new a();

//		a o2 = new b();
		
//		System.out.println("b");
		
		



	}
	public static void main(char[] args) {
		System.out.println("c");
	}

}

class a {

	a() {
		System.out.println("class a");
	}

}

class b extends a {
	b() {
		System.out.println("class b");
	}
}
