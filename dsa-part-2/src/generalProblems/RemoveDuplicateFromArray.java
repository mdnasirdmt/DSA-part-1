package generalProblems;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		

		int[]arr= {2,1,3,3,5,6,2,3,7};
		int n=arr.length;
		
		// maximum in array
		int m=0;
		for (int i = 0; i < arr.length; i++) {
			m= Math.max(m, arr[i]);
		}
		
//		System.out.println(m);
		
		
		// to find number of occurance of element in arr
		int[] freq= new int[m+1];
		
		for (int i = 0; i < arr.length; i++) {
			
			freq[arr[i]]++;

//			System.out.println(freq[arr[i]]);
		}
		
		for (int i = 0; i < freq.length; i++) {
			
			if(freq[i]>=1) {
				System.out.print(i+" ");
			}
			
		}
		
		
	}

}
