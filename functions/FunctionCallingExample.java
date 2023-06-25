/**
 * 
 */
package functions;

/**
 * @author Rupayan Dirghangi
 *
 */
public class FunctionCallingExample {
	public static void b() {
		System.out.println("Inside b");
	}

	public static void a() {
		b();
		System.out.println("Inside a");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
		System.out.println("Inside Main");

	}

}
