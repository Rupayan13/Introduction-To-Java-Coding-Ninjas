/**
 * 
 */
package functions;

/**
 * @author Rupayan Dirghangi
 *
 */
public class FunctionOutputQuestion {
	public static void c(int n) {
		System.out.println("Inside c "+n);
		n++;
	}
	public static void b(int n) {
		c(n);
		System.out.println("Inside b "+n);
		n++;
	}
	public static void a(int n) {
		b(n);
		System.out.println("Inside a "+n);
		n++;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		a(n);
		System.out.println("Inside Main "+n);

	}

}
