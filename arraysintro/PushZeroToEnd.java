/**
 * 
 */
package arraysintro;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PushZeroToEnd {
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The element in array at index "+i+" is "+arr[i]);
		}
	}
	
	public static void pushZerosAtEnd(int arr[])
	{
		int nonZero=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[nonZero];
				arr[nonZero]=temp;
				nonZero++;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int arr[]= {2, 0, 0, 1, 3, 0, 0};
		pushZerosAtEnd(arr);
		printArray(arr);

	}

}
