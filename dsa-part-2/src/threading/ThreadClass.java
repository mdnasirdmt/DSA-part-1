package threading;

public class ThreadClass extends Thread {

	public void run() {

		for (int i = 1; i <= 3; i++) {
			System.out.println("thread class " + i);
		}

	}

	public static void main(String[] args) {

		ThreadClass t1 = new ThreadClass();


		t1.start();

		for (int i = 1; i <= 3; i++) {
			System.out.println("thread main " + i);
		}

	}

}
