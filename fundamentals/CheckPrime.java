/**
 * 
 */
package fundamentals;
import java.util.*;

/**
 * @author Rupayan Dirghangi
 *
 */
public class CheckPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int div=2;
//		boolean isPrime=true;
		while(div<=n/2)
		{
			if(n%div==0)
			{
				System.out.println("Composit");
//				isPrime=false;
				return;
			}
			div=div+1;
		}
		System.out.println("Prime");
		
		
//		if(isPrime)
//		{
//			System.out.println("Prime");
//		}
//		else
//		{
//			System.out.println("Composit");
//		}

	}

}
