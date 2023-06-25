/**
 * 
 */
package arraysintro;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SumOf2Arrays {
	public static int[] sumOf2Arrays(int arr1[], int arr2[])
	{
		int i=arr1.length-1;
		int j=arr2.length-1;
		int k=Math.max(arr1.length, arr2.length);
		int output[]=new int[k+1];
		int carry=0;
		while(i>=0 && j>=0)
		{
			int sum=arr1[i]+arr2[j]+carry;
			output[k]=sum%10;
			carry=sum/10;
			i--;
			j--;
			k--;
		}
		while(i>=0)
		{
			int sum=arr1[i]+carry;
			output[k]=sum%10;
			carry=sum/10;
			i--;
			k--;
		}
		while(j>=0)
		{
			int sum=arr2[j]+carry;
			output[k]=sum%10;
			carry=sum/10;
			j--;
			k--;
		}
		output[0]=carry;
		return output;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1, 2, 3, 4, 5};
		int arr2[]= {3, 2, 6, 8, 9};
		int arr[]=sumOf2Arrays(arr1, arr2);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
