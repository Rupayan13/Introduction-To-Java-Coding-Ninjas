/**
 * 
 */
package arraysintro;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrintAllPairs {
	public static void printAllPairs(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 4, 7, 6, 5};
		printAllPairs(arr);

	}

}
