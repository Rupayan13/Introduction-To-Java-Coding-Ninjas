/**
 * 
 */
package fundamentals;

/**
 * @author Rupayan Dirghangi
 *
 */
public class IncrementDecrement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=60;
////		System.out.println(a++);
////		System.out.println(++a);
////		int b = a++;
//		int b=++a;
//		System.out.println(a);
//		System.out.println(b);
		
		
		int a=60, b=80;
		
		if(++a > 60 || b++ >80) {
			System.out.println("Inside if");
		}
		else {
			System.out.println("Inside else");
		}
		System.out.println("a "+a+" b "+b);

	}

}
