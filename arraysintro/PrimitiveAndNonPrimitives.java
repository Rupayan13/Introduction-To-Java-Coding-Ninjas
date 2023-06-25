/**
 * 
 */
package arraysintro;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrimitiveAndNonPrimitives {
	public static void increment(int i) {
		i++;
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println("element at " + i + " index:" + arr[i]);
		}
	}
	
	public static int[] incrementArray(int arr[])
	{
		arr=new int[7];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]+1;
		}
		return arr;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=10;
//		increment(i);
//		System.out.println(i);

		int arr[] = { 1, 2, 3, 4, 5 };
		arr=incrementArray(arr);
		printArray(arr);

	}

}
