/**
 * 
 */
package fundamentals;
import java.util.*;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SumOfNNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0, i=1;//i is the next number to be added
		while(i<=n) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);

	}

}
