/**
 * 
 */
package strings;

/**
 * @author Rupayan Dirghangi
 *
 */
public class UnderstandingStringStorage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		String str2 = new String("abc");
//		str.setCharAt(2)='i'; //It gives us a error because strings are immutable.
		str="xyz";
		str = str + "def";
		System.out.println(str);

	}

}
