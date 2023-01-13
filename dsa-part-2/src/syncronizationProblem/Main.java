package syncronizationProblem;

public class Main {

	synchronized void printValue(int n) {

		for (int i = 1; i <= 3; i++) {
			System.out.println(i * n);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Syncro1 syncro1 = new Syncro1(new Main());
		Syncro2 syncro2 = new Syncro2(new Main());

		Thread t1 = new Thread(syncro1);
		Thread t2 = new Thread(syncro2);

		t2.start();
		t2.join();
		
		t1.start();
		t1.join();

	}

}

class Syncro1 implements Runnable {

	Main m;

	public Syncro1(Main m) {
		this.m = m;
	}

	@Override
	public void run() {
		m.printValue(500);
	}

}

class Syncro2 implements Runnable {
	
	Main m;

	public Syncro2(Main m) {
		this.m = m;
	}

	@Override
	public void run() {
		
		m.printValue(300);
	}

}