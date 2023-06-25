/**
 * 
 */
package arraysintro;

/**
 * @author Rupayan Dirghangi
 *
 */
public class InsertionSort {
	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println("element at " + i + " index:" + arr[i]);
		}
	}

	public static void insertionSort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			// Insert ith element into the sorted portion
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			//Position will be j+1
			arr[j+1]=temp;

		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 9, 6, 3, 7, 2, 8, 1, 5 };
		insertionSort(arr);
		printArray(arr);

	}

}
