package GeneralProblem;

public class Multithreadings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mulTit m = new mulTit();
		Thread t1 = new Thread(m);

		m.start();

		for (int i = 0; i < 3; i++) {
			System.out.println("thread main " + i);

		}
	}

}

class mulTit extends Thread {

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("thread created " + i);

		}
	}
}