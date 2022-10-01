package revisionDsa;

import java.util.Arrays;

public class SortArr2 {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 6, 7, 5, 2 };

		selectionSort(arr, arr.length);

	}

	static void selectionSort(int[] arr, int n) {

		for (int i = 0; i < n - 1; i++) {
			int min = i;

			for (int j = i + 1; j < n; j++) {

				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			int tem = arr[min];
			arr[min] = arr[i];
			arr[i] = tem;

		}
		System.out.println(Arrays.toString(arr));

	}
}
