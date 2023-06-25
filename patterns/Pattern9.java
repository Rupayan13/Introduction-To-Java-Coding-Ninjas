/**
 * 
 */
package patterns;
import java.util.*;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Pattern9 {

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
			int j=1;
			char ch=(char)('A'+i-1);
			while(j<=n)
			{
				System.out.print(ch);
				j=j+1;
				ch=(char)(ch+1);
			}
			System.out.println();
			i=i+1;
		}

	}

}
