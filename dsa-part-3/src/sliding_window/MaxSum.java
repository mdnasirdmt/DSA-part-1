package sliding_window;

public class MaxSum {

	public static void main(String[] args) {
		
		int[]arr= { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
		int k=4;
		//expected output=24
		System.out.println(maxSum(arr, arr.length, k));

	}

	private static int maxSum(int[] arr, int length, int k) {
		
		int sum=0;
		int max=0;
		for (int i = 0; i < k; i++) {
			
			sum+=arr[i];
			
		}

		int windowSum=sum;
		for (int i = k; i < arr.length; i++) {
			windowSum+=arr[i]-arr[i-k];
			max=Math.max(max, windowSum);			
		}
		
		return max;
	}

}
