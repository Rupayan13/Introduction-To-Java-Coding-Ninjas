/**
 * 
 */
package arrays2d;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class InputAndPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int cols=sc.nextInt();
		int arr[][]=new int[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.println("Enter the "+i+"th row and "+j+"th column element:");
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
