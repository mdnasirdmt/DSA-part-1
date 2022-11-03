package test;

public class ThreadCreationByClass {
	public static void main(String[] args) throws InterruptedException {

		Thread_1 t = new Thread_1();

//		Thread t1 = new Thread(t);
//		t1.start();
		
		t.start();

		for (int i = 0; i < 3; i++) {
			System.out.println("main thread " + 1);
		}

	}

}

class Thread_1 extends Thread {

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("thread_1 " + i);
		}
	}
}
