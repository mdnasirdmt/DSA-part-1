package syncronizationProblem;

public class Main {
	public static void main(String[] args) {

		Syncro1 syncro1 = new Syncro1();
		Syncro2 syncro2 = new Syncro2();

		Thread t1 = new Thread(syncro1);
		Thread t2 = new Thread(syncro2);

		t1.start();
		t2.start();

	}

}

class Syncro1 implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 3; i++) {
			System.out.println(i * 100);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class Syncro2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(i * 500);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}