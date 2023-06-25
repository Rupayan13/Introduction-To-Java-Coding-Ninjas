/**
 * 
 */
package arraysintro;

/**
 * @author Rupayan Dirghangi
 *
 */
public class BasicsOfArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		arr[0] = 5;
		arr[5] = 17;
		System.out.println(arr[0]);
		System.out.println(arr[5]);

//		arr[-1]=18; negetive index will never be there
//		arr[10]=15; out of range, its range is 0 to 9
		
		System.out.println(arr[3]); //it was not declared, so by default it is intialized to zero
		System.out.println(arr[4]);
		
		
		char[] cArray=new char[10];
		double[] dArray=new double[10];
		System.out.println(cArray[0]); //character array is initialized to null characters
		System.out.println(dArray[0]); //double array is initialized to double value
	}

}
