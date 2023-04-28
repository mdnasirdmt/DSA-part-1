package twoPointers;

import java.util.Arrays;

public class Pairs {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 0, 2, 7 };
		int k = 2;
		Arrays.sort(arr);
		System.out.println(pairs(arr, arr.length, k));

	}

	private static int pairs(int[] arr, int length, int k) {
		int left = 0, right = arr.length - 1, sum = 0;
		while (left < right) {
			sum = arr[left] + arr[right];

			if (sum == k) {
				return 1;
			} else if (sum < k) {
				left++;
			} else {
				right--;
			}

		}

		return -1;
	}

}
