/**
 * 
 */
package fundamentals;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ContinueKeyword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=1;
		int n=5;
//		while(i<=n)
//		{
//			i++;
//			if(i==4)
//			{
////				break;
//				continue;
//			}
////			i++;
//			System.out.println(i);
//		}
		
		for(int i=1;i<=n;i++)
		{
			if(i==4)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
