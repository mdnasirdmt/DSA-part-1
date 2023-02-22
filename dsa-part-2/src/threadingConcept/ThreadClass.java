package threadingConcept;

public class ThreadClass extends Thread {

	public void run() {

		for (int i = 1; i <= 3; i++) {

			System.out.println("thread classs " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadClass t1 = new ThreadClass();
		t1.start();
//		t1.sleep(1000);
//		t1.setPriority(MAX_PRIORITY);
//		t1.setName("sree");
//		System.out.println(t1.getName());

		for (int i = 1; i <= 3; i++) {

			System.out.println("thread main " + i);
		}
		t1.join();

	}

}
