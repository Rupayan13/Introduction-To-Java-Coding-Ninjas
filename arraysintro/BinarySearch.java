/**
 * 
 */
package arraysintro;

/**
 * @author Rupayan Dirghangi
 *
 */
public class BinarySearch {
	public static int binarySearch(int arr[], int ele)
	{
		int s=0;
		int e=arr.length-1;
		while(s<=e)
		{
			int mid=(s+e)/2;
			if(arr[mid]>ele)
			{
				e=mid-1;
			}
			else if(arr[mid]<ele)
			{
				s=mid+1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 4, 7, 10, 20, 35, 40};
		int num=7;
		int index=binarySearch(arr, num);
		System.out.println("Index of the number "+num+" is "+index);
		

	}

}
