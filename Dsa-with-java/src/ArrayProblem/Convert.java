package ArrayProblem;

import java.util.Arrays;
import java.util.Iterator;

public class Convert {

	public static void main(String[] args) {
		int n = 95;

//		1st approuch
//		String s=String.valueOf(n);
//		String[]a= s.split("");
//		int[]arr=new int[a.length];
//		for(int i=0;i<a.length;i++) {
//			arr[i]= Integer.parseInt(a[i]);
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(a));

		// 2nd approuch
		int[] arr = new int[2];

		int d1=n/10;
		int r1=n%10;
		arr[0] = n / 10;
		arr[1] = n % 10;
		System.out.println(d1);
		System.out.println(r1);
		System.out.println(Arrays.toString(arr));

	}

}

//in this question we have to convert integer into array
// example- int n=95, arr=[9,5]
