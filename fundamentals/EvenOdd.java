/**
 * 
 */
package fundamentals;
import java.util.*;

/**
 * @author Rupayan Dirghangi
 *
 */
public class EvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a;
		a=sc.nextInt();
		int rem=a%2;
//		boolean result = rem==0;
//		if(result==true)
//		if(result)
		if(rem==0)
		{
			System.out.println(a+ " is Even");
		}
		if(rem==1)
		{
			System.out.println("Odd");
		}
//		else {
//			System.out.println("Odd");
//		}

	}

}
