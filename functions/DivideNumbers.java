/**
 * 
 */
package functions;

/**
 * @author Rupayan Dirghangi
 *
 */
public class DivideNumbers {
	public static int divideNumbers(int num, int den) {
		if(den==0)
		{
			return Integer.MIN_VALUE;
		}
//		System.out.println("Inside Division Function");
		return num/den;
	}
	
	public static void printDivisionResult(int num, int den)
	{
		if(den==0)
		{
//			exit the function
			System.out.println("Diviion by zero is not allowed");
			return;
		}
		System.out.println(num/den);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8;
		int den=0;
		int result = divideNumbers(num, den);
		System.out.println(result);
		printDivisionResult(num, den);

	}

}
