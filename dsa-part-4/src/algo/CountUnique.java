package algo;

import java.util.Arrays;

public class CountUnique {
	
	public static void main(String[] args) {
		
		int[]arr= {3,2,4,6,7,2,3,5,6,7};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int c=1;
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i-1]!=arr[i]) {
				c++;
			}
		}
		System.out.println(c);
	}

}
