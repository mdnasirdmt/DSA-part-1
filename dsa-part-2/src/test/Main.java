package test;

public class Main {

	public static void main(String[] args) {

//		a o1= new a();

		a o2 = new b();
		
		



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
