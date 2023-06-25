/**
 * 
 */
package arraysintro;
import java.util.*;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RotateArray {
	public static void swap(int A[], int l, int r)
	{
		int temp=A[l];
		A[l]=A[r];
		A[r]=temp;
	}
	public static void reversebetween(int A[], int l, int r)
	{
		r--;
		int len=(r-l)/2;
		for(int i=0;i<=len;i++)
		{
			swap(A,l,r);
			l++;
			r--;
		}
	}
	public static void rotateRight(int A[], int n, int X)
	{
		reversebetween(A,0,n);
		reversebetween(A,0,n-X);
		reversebetween(A,n-X,n);
	}
	public static void rotateLeft(int A[], int n, int X)
	{
		reversebetween(A,0,n);
		reversebetween(A,0,X);
		reversebetween(A,X,n);
	}
	public static void rotateArray(int A[], int n, int X, String dir) {
		X=X%n;
		if(X>0 && dir.equals("LEFT"))
		{
			rotateLeft(A,n,X);
		}
		else if(X>0 && dir.equals("RIGHT"))
		{
			rotateRight(A,n,X);
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the length of the array:");
		int n=sc.nextInt();
//		System.out.println("Enter the shift position:");
		int X=sc.nextInt();
//		System.out.println("Enter what do you want , LEFT or RIGHT:");
		String dir=sc.next();
		int A[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value at index "+i+" :");
			A[i]=sc.nextInt();
		}
		rotateArray(A, n, X, dir);

	}

}
