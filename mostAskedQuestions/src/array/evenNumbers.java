package array;

public class evenNumbers {

	public static void main(String[] args) {

		int []arr= {1,2,3,4,1,2,5};
		
		for(int i= 0; i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				
				System.out.println(arr[i]+ " even number");
			}else {
				System.out.println(arr[i]+ " odd number");
			}
 
			
		}

	}

}
