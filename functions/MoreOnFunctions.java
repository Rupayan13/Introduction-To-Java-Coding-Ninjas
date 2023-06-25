/**
 * 
 */
package functions;

import java.util.*;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MoreOnFunctions {

	/**
	 * @param args
	 */
	public static double sum(int a, int b, double c) {
		double ans = a + b + c;
		return ans;
	}
	
	public static void printEvenNumbers(int start, int end) {
		if(start%2!=0) {
			start++;
		}
		for(int i=start;i<=end;i=i+2)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int num1 = 10;
//		int num2 = 16;
////		sum(num1, num2, 10.5);
//		double ans = sum(num1, num2, 10.5);
//		System.out.println(ans);
		
		printEvenNumbers(3, 17);

	}

}
