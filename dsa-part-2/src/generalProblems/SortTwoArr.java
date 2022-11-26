package generalProblems;

import java.util.Arrays;

public class SortTwoArr {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		int[] arr1 = { 6, 4, 5 };
		
		String m="";
		
		for(int i=0; i<arr.length;i++)
			m+=arr[i]+" ";
		
		for(int i=0;i<arr1.length;i++)
			m+=arr1[i]+" ";
		
		int[] a= Arrays.stream(m.split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

	}

}
