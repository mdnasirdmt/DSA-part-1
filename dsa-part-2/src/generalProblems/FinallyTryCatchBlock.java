package generalProblems;

public class FinallyTryCatchBlock {

	public static void main(String[] args) {

		try {
			int x = 10;
			int y = 0;
			int z = 0;

			System.out.println("x  y  z   value is " + x + " ," + y + " ," + z);
			System.exit(1);  // at this point finally block will not execute 
			z = x / y;
			System.out.println("z value is " + z);
		} catch (Exception e) {
			System.out.println("catch block ");
		} finally {
			System.out.println("finally block");
		}

	}

}
