package generalProblems;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 4, 5, 6, 7 };

		int left = 0, right = arr.length - 1, k = 7;

		int x = khoj(arr, left, right, k);
		
		if(x==-1) {
			System.out.println("not found");
		}else {
			System.out.println("found "+ x);
		}

	}

	private static int khoj(int[] arr, int left, int right, int k) {

		int mid = left + (right - left) / 2;
		while (left <= right) {
			if (arr[mid] == k) {
				return arr[mid];
			} else if (arr[mid] > k) {
				return khoj(arr, 0, mid - 1, k);
			} else {
				return khoj(arr, mid+1, right, k);
			}
		}
		return -1;

	}

}
