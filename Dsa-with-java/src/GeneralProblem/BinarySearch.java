package GeneralProblem;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[]arr = {1,2,3,4,5,6,7};
		
		int left=0, right=arr.length-1, x=7;
		
	int num= binaryKhoj(arr,left,right, x);

	if(num==-1) {
		System.out.println("not found ");
	}
	else {
		System.out.println("found "+ num);
	}
	}

	private static int binaryKhoj(int[] arr, int left, int right,int x) {
		
		int mid= left+(right-left)/2;
		
		while(left<=right) {
			
			if(arr[mid]==x) {
				return arr[mid];
			}
			else if(arr[mid]>x) {
				
				return binaryKhoj(arr, left, mid-1, x);
			}
			else {
				return binaryKhoj(arr, mid+1, right, x);
			}
		}
		
		return -1;
	}

}
/*
 * Binary Search Approach: 

Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half. The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(Log n). 

Binary Search Algorithm: The basic steps to perform Binary Search are:

Begin with the mid element of the whole array as a search key.
If the value of the search key is equal to the item then return an index of the search key.
Or if the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
Otherwise, narrow it to the upper half.
Repeatedly check from the second point until the value is found or the interval is empty.*/
