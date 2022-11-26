package generalProblems;
interface Intr{
	void fun(String s);
}

interface Intr1{
	int fun1();
}
public class Lamda {

	public static void main(String[] args) {
		
		Intr intr= (s)-> {
			System.out.println(s);
		};
		intr.fun("nasir");
		
		
		Intr1 i1= ()->{
			return 10*2;
		};
		System.out.println(i1.fun1());
		
	}

}
