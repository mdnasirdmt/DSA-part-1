package test;

public class Test {

	public static void main(String[] args) {

//		123
//		456
//		789

//		147
//		258
//		369

		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] mat1 = new int[3][3];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				mat1[j][i] = mat[i][j];
			}
		}

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
//				mat1[j][i] = mat[i][j];
				
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
