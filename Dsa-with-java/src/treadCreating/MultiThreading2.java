package treadCreating;

public class MultiThreading2 implements Runnable{

	public static void main(String[] args) {
		
		MultiThreading2 m= new MultiThreading2();
		
		Thread t1= new Thread(m);
		
	}

	@Override
	public void run() {
		for(int i=0;i<3;i++)
			System.out.println("custome thread "+i);
		
	}
}
