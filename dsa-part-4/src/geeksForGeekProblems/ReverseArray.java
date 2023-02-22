package geeksForGeekProblems;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[]arr= {4,2,5,6,10,8,9,7};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int[]arr1= new int[arr.length];
		int j=0;
		for (int i = arr.length-1; i >=0; i--) {
			
			
			arr1[j++]=arr[i];
			
			
		}

		System.out.println(Arrays.toString(arr1));
	}

}
