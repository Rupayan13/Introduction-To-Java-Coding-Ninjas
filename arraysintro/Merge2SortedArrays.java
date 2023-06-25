/**
 * 
 */
package arraysintro;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Merge2SortedArrays {
	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println("element at " + i + " index:" + arr[i]);
		}
	}

	public static int[] merge2SortedArrays(int arr1[], int arr2[]) {
		int m = arr1.length;
		int n = arr2.length;
		int arr[] = new int[m + n];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < m && j < n) {
			if (arr1[i] <= arr2[j]) {
				arr[k] = arr1[i];
				k++;
				i++;
			} else {
				arr[k] = arr2[j];
				k++;
				j++;
			}
		}
		while(i<m)
		{
			arr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<n)
		{
			arr[k]=arr2[j];
			j++;
			k++;
		}
		return arr;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 4, 8, 10, 13, 17 };
		int arr2[] = { 2, 3, 5, 7, 9, 11, 12 };

		int arr3[] = merge2SortedArrays(arr1, arr2);
		printArray(arr3);
	}

}