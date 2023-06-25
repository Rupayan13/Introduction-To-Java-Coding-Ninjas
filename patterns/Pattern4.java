/**
 * 
 */
package patterns;
import java.util.*;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Pattern4 {

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
//			int j=n;
//			while(j>=1)
//			{
//				System.out.print(j);
//				j=j-1;
//			}
			
			int j=1;
			while(j<=n){
				System.out.print(n-j+1);
				j=j+1;
			}
			
			System.out.println();
			i=i+1;
		}

	}

}
