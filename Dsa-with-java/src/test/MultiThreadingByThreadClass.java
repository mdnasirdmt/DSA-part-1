package test;

public class MultiThreadingByThreadClass {
	
	public static void main(String[] args) {
		
		ThreadClass t1= new ThreadClass();
		
		t1.start();
		
		for(int i=0;i<3;i++)
			System.out.println("hello main thread "+i);
	}

}

class ThreadClass extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<3;i++)
			System.out.println("hello thread "+i);
	}
	
}