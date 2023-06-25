/**
 * 
 */
package strings;

/**
 * @author Rupayan Dirghangi
 *
 */
public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("abc");//It is mutable
		str.setCharAt(0, 'd');
		str.append("def");
		System.out.println(str);
		String s="d";
		for(int i=0;i<5;i++)
		{
			s+='z';//Create a new string and then concate, for that StringBuffer is easy to use when there is multiple changing in a string
		}
		System.out.println(s);

	}

}
