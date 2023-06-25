/**
 * 
 */
package fundamentals;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ArithmeticOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 3;
		int c = a % b;
		int d = a / b;
		double f = 10 / 30;
		int e = 3 + 2 / 5;//BODMAS is there
		int g = 3 * 2 / 5;// * and / has the same precedence , so the exp goes from left to right
		int h = 10/ (2*3);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		System.out.println(e);
		System.out.println(g);
        System.out.println(h);
	}

}
