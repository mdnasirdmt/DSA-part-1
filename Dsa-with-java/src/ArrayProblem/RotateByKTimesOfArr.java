package ArrayProblem;

import java.util.Arrays;

public class RotateByKTimesOfArr {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 2;

		rotateArr(arr, k);
		System.out.println(Arrays.toString(arr));

	}

	private static void rotateArr(int[] arr, int k) {

		int n = arr.length;

		if (k == 0) {
			return;
		}

		k = k % n;

		rotateArrByk(arr, 0, k - 1);
		rotateArrByk(arr, k, n - 1);
		rotateArrByk(arr, 0, n - 1);

	}

	private static void rotateArrByk(int[] arr, int start, int end) {

		int tem=0;
		while (start < end) {

			tem = arr[start];

			arr[start] = arr[end];
			arr[end] = tem;

			start++;
			end--;

		}

	}

}
