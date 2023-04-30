package anonymousClass;

interface Intr{
	void fun(String str);
}

public class InnerClass {

	public static void main(String[] args) {
		
		Intr intr = new Intr() {
			
			@Override
			public void fun(String str) {
				System.out.println(str + "anonymous class example !");
			}
		};
		
		intr.fun("this first is ");

	}

}
