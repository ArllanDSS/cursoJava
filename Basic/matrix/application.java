package matrix;

import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int mat[][] = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}

		}

		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if (x == mat[i][j]) {

					System.out.println("Position " + i + "," + j + ":");
					if (j - 1 >= 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (j + 1 < mat[i].length) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i - 1 >= 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (i + 1 < mat[i].length) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}

			}
		}

		sc.close();

	}

}
