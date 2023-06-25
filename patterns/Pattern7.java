/**
 * 
 */
package patterns;
import java.util.*;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Pattern7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1, p=i;
			while(j<=i)
			{
				System.out.print(p);
				p=p+1;
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}

	}

}
