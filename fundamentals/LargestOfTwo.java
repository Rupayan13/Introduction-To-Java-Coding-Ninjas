/**
 * 
 */
package fundamentals;

import java.util.*;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LargestOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();

		if (a > b) {
			System.out.println("First number is greater than second number");
		}

		else if (b > a) {
			System.out.println("Second number is greater than First number");
		} else {
			System.out.println("Both are equal");
		}
		
		
		
//		if (a > b) {
//			System.out.println("First number is greater than second number");
//		}
//
//		if (b > a) {
//			System.out.println("Second number is greater than First number");
//		} 
//		if(a==b) 
//		{
//			System.out.println("Both are equal");
//		}
		
		

//		if(a>b) {
//			System.out.println("First number is greater than second number");
//		}
//		else {
//			if(b>a) {
//				System.out.println("Second number is greater than First number");
//			}
//			else {
//				System.out.println("Both are equal");
//			}
//		}
		System.out.println("Outside if else");

	}

}
