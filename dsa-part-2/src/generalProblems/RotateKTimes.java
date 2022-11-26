package generalProblems;

import java.util.Arrays;

public class RotateKTimes {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 2;

		rotateArr(arr, k);
		System.out.println(Arrays.toString(arr));
	}

	private static void rotateArr(int[] arr, int k) {

		if (k == 0) {
			return;
		}

		k = k % arr.length;

		rotateK(arr, 0, k - 1);
		rotateK(arr, k, arr.length-1);
		rotateK(arr, 0, arr.length- 1);

	}

	private static void rotateK(int[] arr, int i, int j) {
		int tem = 0;

		while (i < j) {
			tem = arr[i];
			arr[i]=arr[j];
			arr[j]=tem;
			
			i++;
			j--;
		}

	}

}
