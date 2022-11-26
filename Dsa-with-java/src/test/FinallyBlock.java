package test;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			System.out.println("I am in try block");
			System.exit(2);
//			return;
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("I am in finally block");
		}
	}
}
