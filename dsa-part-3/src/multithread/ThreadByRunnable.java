package multithread;

public class ThreadByRunnable{

	public static void main(String[] args) {
		
		Thread1 th= new Thread1();
		
		Thread t1= new Thread(th);
		
		t1.start();
		
		
		for(int i=0;i<=3;i++) {
			System.out.println(" inside main thread "+i);
		}
		

	}

}

class Thread1 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<=3;i++) {
			System.out.println("thread1 inside run method "+i);
		}
	}
	
}
