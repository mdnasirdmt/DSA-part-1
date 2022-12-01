package generalProblems;

import java.util.Arrays;

public class SortSelection {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 2, 4, 8, 3, 6, 7, 0 };

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int min = i;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
				
//				if (arr[min] < arr[j]) {  if we uncomment this if condition and comment above if condition
//										  then it will give reverse sorted array
//					min = j;
//				}
			}
			int t = arr[min];
			arr[min] = arr[i];
			arr[i] = t;
		}

		System.out.println(Arrays.toString(arr));

	}

}
