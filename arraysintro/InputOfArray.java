/**
 * 
 */
package arraysintro;
import java.util.*;
/**
 * @author Rupayan Dirghangi
 *
 */
public class InputOfArray {
	public static void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.println("element at "+i+" index:"+arr[i]);
		}
	}
	public static int[] takenInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element at "+i+" index:");
			arr[i]=sc.nextInt();
		}
		return arr;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=takenInput();
		printArray(arr);
		

	}

}
