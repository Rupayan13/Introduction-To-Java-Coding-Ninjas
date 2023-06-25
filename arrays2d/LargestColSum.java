/**
 * 
 */
package arrays2d;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LargestColSum {
	public static int largestCol(int arr[][])
	{
		int rows=arr.length;
		int cols=arr[0].length;
		int largest=Integer.MIN_VALUE;
		for(int j=0;j<cols;j++)
		{
			int sum=0;
			for(int i=0;i<rows;i++)
			{
				sum+=arr[i][j];
			}
			if(sum>largest)
			{
				largest=sum;
			}
		}
		return largest;
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
		int arr[][] = takeInput();
		int larColSum=largestCol(arr);
		System.out.println(larColSum);

	}

}
