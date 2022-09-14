package assignment_3_RJ101;

import java.util.Arrays;

public class SortnigAlgo {

	public static void main(String[] args) {

		int arr[] = { 64, 25, 12, 22, 11 };
		int n = arr.length;

		SelectionSort ss = new SelectionSort();
		ss.sort(arr, n);

		BubbleSort bs = new BubbleSort();
		bs.sort(arr, n);

		InsertionSort is = new InsertionSort();
		is.sort(arr, n);

	}
}

abstract class SortingAlgorithm {
	abstract void sort(int[] arr, int n);

}

class SelectionSort extends SortingAlgorithm {

	@Override
	void sort(int[] arr, int n) {

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}

		System.out.println("selection sort " + Arrays.toString(arr));

	}

}

class InsertionSort extends SortingAlgorithm {

	@Override
	void sort(int[] arr, int n) {

		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		
		System.out.println("Insertion  sort " + Arrays.toString(arr));

	}

}

class BubbleSort extends SortingAlgorithm {

	@Override
	void sort(int[] arr, int n) {

		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

		System.out.println("Bubble sort " + Arrays.toString(arr));

	}

}

/*
 * ### Problem 4 :
 * 
 * - Create Abstract Class **SortingAlgorithm** - Create 3 classes i.e
 * SelectionSort, Insertion Sort, and BubbleSort, and extend them to
 * **SortingAlgorithm** - Include the **sort(arr[], n)** function in each of the
 * above classes implementing the respective algorithm. - **void** **sort(arr[],
 * n)** Takes 2 parameter i.e - **arr[] —> Array containing n elements** - **n
 * —> Size of the array**
 * 
 * From the **SortingRunner** class,
 * 
 * - Call the three sort functions from the **SortingAlgorithm** object with
 * array size.
 ** 
 * Output:** Print the array each time After calling to sort function.
 * 
 * 
 * 
 */
