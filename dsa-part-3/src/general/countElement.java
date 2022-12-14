package general;

import java.util.ArrayList;
import java.util.Arrays;

public class countElement {

	public static void main(String[] args) {
		
		
		int[]arr= {1,2,2,4,8,5,3,1,3,3};
		
//		ArrayList<Integer> al= new ArrayList<>(Arrays.asList(1,2,3,4,8,5,3,1,3));
		
		
//		System.out.println(al.size());
		
		for (int i = 0; i < arr.length; i++) {
			int c=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					c++;
					
				}
			}
			if(c>1) {
				System.out.println(arr[i]+" = "+ c);
			}
		}

	}

}
