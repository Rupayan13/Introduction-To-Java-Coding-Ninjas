/**
 * 
 */
package arrays2d;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SpiralPrint {
	public static void spiralPrint(int matrix[][]) {
		int nRows = matrix.length;
		if (nRows == 0) {
			return;
		}
		int mCols = matrix[0].length;
		int rowStart = 0, colStart = 0;
		int numElements = nRows * mCols;
		int count = 0;
		while (count < numElements) {
			for (int i = colStart; count < numElements && i < mCols; i++) {
				System.out.print(matrix[rowStart][i]+" ");
				count++;
			}
			rowStart++;

			for (int i = rowStart; count < numElements && i < nRows; i++) {
				System.out.print(matrix[i][mCols - 1]+" ");
				count++;
			}
			mCols--;

			for (int i = mCols - 1; count < numElements && i >= colStart; i--) {
				System.out.print(matrix[nRows - 1][i]+" ");
				count++;
			}
			nRows--;

			for (int i = nRows - 1; count < numElements && i >= rowStart; i--) {
				System.out.print(matrix[i][colStart]+" ");
				count++;
			}
			colStart++;
		}

	}

	public static int[][] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns:");
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Enter the " + i + "th row and " + j + "th column element:");
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = takeInput();
		spiralPrint(arr);

	}

}
