/**
 * 
 */
package fundamentals;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Precedence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=6;
		int a= ++i *5;
		int j=8;
		boolean b = i+5 >5 && j>6;
		int c= 5*2/8; //left to right
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);

	}

}
