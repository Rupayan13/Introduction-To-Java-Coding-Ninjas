/**
 * 
 */
package fundamentals;

/**
 * @author Rupayan Dirghangi
 *
 */
public class TypeConversions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		int i=ch;
		ch=(char)i;//Explicitly converted
		ch=(char)(ch+1);
		System.out.println(i);
		System.out.println(ch);
		
		
		short s=17;
		int j=s;
		s=(short)j;
		System.out.println(j);
		System.out.println(s);
		
		
		int k=(int)10.6;
		System.out.println(k);
		
//		float f=1.7f;
		float f=(float)1.7;
		System.out.println(f);
		
		System.out.println(4+4);
		System.out.println(4+4.5);
		System.out.println(4.1+4.4);

	}

}
