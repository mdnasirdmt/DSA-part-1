package generalProblems;

public class MatrixTranspose {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//		System.out.println(arr.length);
//		System.out.println(arr[0].length);

		int[][] mat = new int[3][3];

		// storing values to mat
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				mat[i][j] = arr[j][i];
			}
		}

		// printing values of mat
		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}

//123
//456
//789

//147
//258
//369
