package binarySearch;

import java.util.Arrays;

public class FindNumber {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 1, 3, 5, 3, 21, 4, 10 };
		Arrays.sort(arr);

		int find = 10;

		int left = 0, right = arr.length - 1;

		int k = khoj(arr, left, right, find);

		if (k == find)
			System.out.println(1);
		else
			System.out.println("-1");

	}

	private static int khoj(int[] arr, int left, int right, int find) {

		if (arr.length == 0) {
			return -1;
		}

		int mid = left + (right - left) / 2;

		if (arr[mid] == find)
			return arr[mid];
		else if (arr[mid] < find)
			return khoj(arr, mid + 1, right, find);
		else if (arr[mid] > find)
			return khoj(arr, left, mid - 1, find);
		return mid;

	}

}
