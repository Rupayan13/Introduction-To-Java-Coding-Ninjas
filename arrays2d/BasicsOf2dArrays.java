/**
 * 
 */
package arrays2d;

/**
 * @author Rupayan Dirghangi
 *
 */
public class BasicsOf2dArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr2d[][]=new int [3][4];
		System.out.println(arr2d[1][2]);
		
		arr2d[2][1]=12;
		System.out.println(arr2d[2][1]);
//		System.out.println(arr2d[3][1]);//out of bound
//		System.out.println(arr2d[1][4]);//out of bound
	}

}
