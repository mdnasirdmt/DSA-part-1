package GeneralProblem;

public class BinarySearch2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int num = 8;

		int l = 0;
		int r = n - 1;

		int foundNum = binarySearch(arr, l, r, num);
		if (foundNum == -1) {
			System.out.println("not found ");
		} else {
			System.out.println("found " + num);
		}
	}

	private static int binarySearch(int[] arr, int l, int r, int num) {

		int mid = l + (r - l) / 2;

		while (l <= r) {
			if (arr[mid] == num) {
				return num;
			} else if (num < arr[mid]) {

				return binarySearch(arr, 0, mid - 1, num);
			} else {
				return binarySearch(arr, mid+1, r, num);
			}
		}
		return -1;
		

	}

}
/*
 * Binary Search Approach:
 * 
 * Binary Search is a searching algorithm used in a sorted array by repeatedly
 * dividing the search interval in half. The idea of binary search is to use the
 * information that the array is sorted and reduce the time complexity to O(Log
 * n).
 * 
 * Binary Search Algorithm: The basic steps to perform Binary Search are:
 * 
 * Begin with the mid element of the whole array as a search key. If the value
 * of the search key is equal to the item then return an index of the search
 * key. Or if the value of the search key is less than the item in the middle of
 * the interval, narrow the interval to the lower half. Otherwise, narrow it to
 * the upper half. Repeatedly check from the second point until the value is
 * found or the interval is empty.
 */
