package general;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {

//		int[] arr = { 2, 1, 1, 3, 3, 2, 2, 3, 5, 4, 6, 4 };
		int[] arr = { 20, 10, 20, 70, 30, 60, 50, 20, 30, 30 };

		int m = 0;

		for (int i = 0; i < arr.length; i++) {

			m = Math.max(m, arr[i]);
		}
//		System.out.println(m);

		int[] fre = new int[m + 1];

//		System.out.println(fre.length+" "+arr.length);

		for (int i = 0; i < arr.length; i++) {

			fre[arr[i]]++;
//			System.out.print(fre[arr[i]]++ +" ");
		}
//		System.out.println();
		for (int i = 0; i < fre.length; i++) {

			if (fre[i] >= 1)
				System.out.print(i + " ");

		}

	}

}
