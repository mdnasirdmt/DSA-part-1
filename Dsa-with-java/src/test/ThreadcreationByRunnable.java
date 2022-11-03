package test;

public class ThreadcreationByRunnable implements Runnable {

	public static void main(String[] args) {
		
		ThreadcreationByRunnable t1= new ThreadcreationByRunnable();
		Thread t= new Thread(t1);
		t.start();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("main "+ i);
		}
		

	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("thread_1 "+ i);
		}

	}

}
