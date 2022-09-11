package ArrayProblem;

public class SubArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {

			String bag = "";
			for (int j = i; j < arr.length; j++) {

				bag += arr[j] + " ";
				System.out.println(bag);
			}

		}
	}

}
