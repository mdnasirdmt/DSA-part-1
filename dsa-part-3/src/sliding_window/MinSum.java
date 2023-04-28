package sliding_window;

public class MinSum {

	public static void main(String[] args) {

		int[] arr = { 9, 9, -5, 9, 5 };
		int k = 3;

		// expected output = 9

		System.out.println(minSum(arr, arr.length, k));

	}

	private static int minSum(int[] arr, int length, int k) {
		int sum = 0;
		int min = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}

		min = sum;

		for (int i = k; i < arr.length; i++) {
			sum -= arr[i - k];
			sum += arr[i];
			if (sum < min) {
				min = sum;
			}
		}

		return min;

	}

}
