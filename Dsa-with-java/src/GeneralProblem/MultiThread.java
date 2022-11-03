package GeneralProblem;

public class MultiThread  implements Runnable{

	public static void main(String[] args) {
		 
		MultiThread m= new MultiThread();
		
		Thread t1= new Thread(m);
		t1.start();
		
		
		for(int i=0;i<3;i++) {
			System.out.println("thread main "+i );
			
			
		}

	}

	@Override
	public void run() {
		
		for(int i=0;i<3;i++) {
			System.out.println("thread created "+i );
			
			
		}
	}

}
