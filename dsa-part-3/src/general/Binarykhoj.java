package general;

public class Binarykhoj {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
//		int[] arr = {  };

		int find = 8;

		int l = 0, r = arr.length - 1;

		int n = binarykhoj(arr, l, r, find);
		
//		System.out.println(n);
		
		if (n == -1)
			System.out.println("not found");
		else
			System.out.println("number found " + n);

	}

	private static int binarykhoj(int[] arr, int l, int r, int find) {

		if (arr.length == 0)
			return -1;

		int mid = l + (r - l) / 2;

		while (l <= r) {

			if (arr[mid] == find)
				return arr[mid];
			else if (arr[mid] > find)
				return binarykhoj(arr, l, mid - 1, find);
			else if (arr[mid] < find)
				return binarykhoj(arr, mid + 1, r, find);

			l++;
			r--;
		}

		return -1;

	}

}
