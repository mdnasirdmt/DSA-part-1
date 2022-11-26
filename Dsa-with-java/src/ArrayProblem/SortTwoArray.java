package ArrayProblem;

import java.util.Arrays;

public class SortTwoArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int n1 = arr1.length;
		
		int[] arr2 = { 2, 5, 6 };
		int n2 = arr2.length;

		merge(arr1, n1, arr2, n2);

	}

	private static void merge(int[] arr1, int n1, int[] arr2, int n2) {

		String s="";

		for (int i = 0; i < n1; i++) {

			s+=arr1[i]+" ";

		}

		for (int i = 0; i < n2; i++) {

			s+=arr2[i]+" ";

		}
		
		int[] arr3 = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));

	}

}

/*
 * 
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
 * order, and two integers m and n, representing the number of elements in nums1
 * and nums2 respectively.
 * 
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * 
 * The final sorted array should not be returned by the function, but instead be
 * stored inside the array nums1. To accommodate this, nums1 has a length of m +
 * n, where the first m elements denote the elements that should be merged, and
 * the last n elements are set to 0 and should be ignored. nums2 has a length of
 * n.
 * 
 * 
 * Input: nums1 = [1,2,3], m = 3, nums2 = [2,5,6], n = 3 Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6]. The result of
 * the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */