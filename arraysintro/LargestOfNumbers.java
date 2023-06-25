/**
 * 
 */
package arraysintro;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LargestOfNumbers {
	public static int largest(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int[] takenInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter element at " + i + " index:");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takenInput();
		int lar = largest(arr);
		System.out.println(lar);
		System.out.println(arr);

	}

}
