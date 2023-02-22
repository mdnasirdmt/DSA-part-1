package threading;

public class ThreadRunnable implements Runnable{

	public static void main(String[] args) {
		
		ThreadRunnable th= new ThreadRunnable();
		
		Thread t1= new Thread(th);
		t1.start();
		
//		System.out.println(t1.getState());
		
		for(int i=1;i<=3;i++) {
			System.out.println("thread main "+i);
		}
//		System.out.println(t1.getState());

	}

	@Override
	public void run() {
		
		for(int i=1;i<=3;i++) {
			System.out.println("thread runnable "+i);
		}
		
	}

}
