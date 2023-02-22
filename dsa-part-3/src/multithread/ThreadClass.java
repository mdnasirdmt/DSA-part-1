package multithread;

public class ThreadClass extends Thread{
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=3;i++) {
			System.out.println("thread class in run method "+i);
		}
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		ThreadClass t1= new ThreadClass();
		
		t1.start();
		t1.join();
		
//		t1.setName("hello");
		
		for(int i=0;i<=3;i++) {
			System.out.println("main thread "+i);
		}
		
//		System.out.println(Thread.currentThread().getName());

	}

}

//class ThreadC extends Thread{
//	
//	
//}
