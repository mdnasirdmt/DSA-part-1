package revisionDsa;

import java.util.*;

public class RotateByKTimesOfArr2 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 2;

		sortArray(arr, k);
		System.out.println(Arrays.toString(arr));

	}

	static void sortArray(int[] arr, int k) {

		int n = arr.length;

		if (k == 0) {
			return;
		}

		k = k % n;

		sortArrayBykTimes(arr, 0, k - 1);
		sortArrayBykTimes(arr, k, n - 1);
		sortArrayBykTimes(arr, 0, n - 1);

		
	}

	private static void sortArrayBykTimes(int[] arr, int start, int end) {

		while (start < end) {
			int tem = 0;

			tem = arr[start];
			arr[start] = arr[end];
			arr[end] = tem;

			start++;
			end--;
		}

	}

}

/*
 * 
 * Algorithm: The algorithm can be described with the help of the below
 * pseudocode:
 * 
 * Pseudocode:
 * 
 * Algorithm reverse(arr, start, end): mid = (start + end)/2 loop from i = start
 * to mid: swap (arr[i], arr[end-(mid-i+1)])
 * 
 * Algorithm rotate(arr, d, N): reverse(arr, 1, d) ; reverse(arr, d + 1, N);
 * reverse(arr, 1, N);
 * 
 * Illustration:
 * 
 * Follow the illustration below to for better understanding of the algorithm
 * and intuition:
 * 
 * For example take the array arr[] = {1, 2, 3, 4, 5, 6, 7} and d = 2.
 * 
 * Array Array
 * 
 * The rotated array will look like:
 * 
 * Rotated Array Rotated Array
 * 
 * 1st Step: Consider the array as a combination of two blocks. One containing
 * the first two elements and the other containing the remaining elements as
 * shown above.
 * 
 * Considered 2 blocks Considered 2 blocks
 * 
 * 2nd Step: Now reverse the first d elements. It becomes as shown in the image
 * 
 * Reverse the first K elements Reverse the first K elements
 * 
 * 3rd Step: Now reverse the last (N-d) elements. It become as it is shown in
 * the below image:
 * 
 * Reverse the last (N-K) elements Reverse the last (N-K) elements
 * 
 * 4th Step: Now the array is the exact reversed form of how it should be if
 * left shifted d times. So reverse the whole array and you will get the
 * required rotated array.
 * 
 * The total array is reversed
 */
