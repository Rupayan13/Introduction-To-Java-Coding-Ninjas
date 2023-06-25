/**
 * 
 */
package functions;

/**
 * @author Rupayan Dirghangi
 *
 */
public class FunctionCalling {
	public static int sum(int a, int b)
	{
		int result=a+b;
		return result;
	}
	public static int increment(int n)
	{
		n++;
//		System.out.println("Increment "+n);
		return n;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {//caller function
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		int result=sum(a, b);//callee function
		System.out.println(result);
		int n=10;
		n=increment(n);
		System.out.println("Main "+n);

	}

}
