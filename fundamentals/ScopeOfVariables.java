/**
 * 
 */
package fundamentals;
import java.util.*;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ScopeOfVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j=10;
		while(i<=5) {
			j=10;
			System.out.println(j);
			j++;
			i++;
		}
		System.out.println(i);
//		System.out.println(j);
		
		
		
		
////		System.out.println(a);
//		int a=10;
////		double a=100;
////		int a=100;
//		a=100;
//		
//		if(a>=100)
//		{
////			int a=10;
//			int b=10;
//			System.out.println(b);
//		}
//		else {
//			int c=20;
//			int b=20;
//			System.out.println(c);
//		}
////		System.out.println(b);
//		System.out.println(a);

	}

}
