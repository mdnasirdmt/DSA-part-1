package revisionDsa;

public class SubArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			String bag = "";
			for (int j = i; j < n; j++) {

				bag += arr[j];
				System.out.println(bag + " ");

			}

		}

	}

}
