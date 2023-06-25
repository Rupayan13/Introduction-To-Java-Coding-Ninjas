/**
 * 
 */
package arraysintro;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SelectionSort {
	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println("element at " + i + " index:" + arr[i]);
		}
	}

	public static void selectionSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			// Insert element at ith position
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for (int j = i; j < n; j++) {
				// Finding the minimum element among j positions
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			// Seap minIndex with ith element
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 6, 4, 8, 0, 3 };
		selectionSort(arr);
		printArray(arr);

	}

}
