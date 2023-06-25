/**
 * 
 */
package functions;
import java.util.*;
/**
 * @author Rupayan Dirghangi
 *
 */
public class CheckPrime {
	public static boolean checkPrime(int num) {
		int div = 2;
		while (div <= num / 2) {
			if (num % div == 0) {
				return false;
			}
			div = div + 1;
		}
		return true;
	}
	
	public static boolean checkPrime2(int num) {
		int div = 2;
		boolean isPrime=true;
		while (div <= num / 2) {
			if (num % div == 0) {
				isPrime=false;
				break;
			}
			div = div + 1;
		}
//		if(isPrime==true)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
		return isPrime;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(checkPrime(n));
		System.out.println(checkPrime2(n));

	}

}
