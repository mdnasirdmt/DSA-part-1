package treadCreating;

public class MultiThreading implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 3; i++)
			System.out.println("custome thread" + i);

	}

	public static void main(String[] args) {

		MultiThreading m = new MultiThreading();

		Thread t1 = new Thread(m);

//		m.run();// it will act as normal method
//		t1.run();// it will also act as normal method
		t1.start();// it will act as thread

		for (int i = 0; i < 3; i++)
			System.out.println("main thread" + i);

	}
}
