package geeksForGeekProblems;

import java.util.Arrays;

public class ReverseArra1 {

	public static void main(String[] args) {

		int[] arr = { 4, 2, 5, 6, 10, 8, 9, 7 };
		
		System.out.println(Arrays.toString(arr));
		
		reverseArray(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));

	}

	private static void reverseArray(int[] arr, int i, int j) {
		
		int tem=0;
		
		if(i>=j)
			return;
		
		tem=arr[i];
		arr[i]=arr[j];
		arr[j]=tem;
		reverseArray(arr, i+1, j-1);
		
	}

}
