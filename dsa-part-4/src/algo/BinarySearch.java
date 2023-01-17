package algo;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 3, 21, 5, 7, 8 };

		Arrays.sort(arr);

		int l = 0, r = arr.length - 1, num = 2;

		int n = binarySearch(arr, l, r, num);

		if (n == num)
			System.out.println("number found in arr " + n);
		else
			System.out.println("not found ");

	}

	private static int binarySearch(int[] arr, int l, int r, int num) {

		int mid = l + (r - l) / 2;

		if (arr[mid] == num) {

			return arr[mid];
		}

		while (l <= r) {

			if (arr[mid] > num) {
				return binarySearch(arr, l, mid - 1, num);
			} else if (arr[mid] < num) {
				return binarySearch(arr, mid + 1, r, num);
			}

		}

		return 0;

	}

}
