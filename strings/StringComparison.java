/**
 * 
 */
package strings;

/**
 * @author Rupayan Dirghangi
 *
 */
public class StringComparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abc";
		String str2="abc";
		if(str1==str2)
		{
			System.out.println("Strings are equal.");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		//It shows equal because of string pool
		String str3=new String("abc");
		if(str1==str3)
		{
			System.out.println("Strings are equal.");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		//equals function
		if(str1.equals(str3))
		{
			System.out.println("Strings are equal.");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		
		
		
//		int arr1[]= {1, 2};
//		int arr2[]= {1, 2};
//		if(arr1==arr2)
//		{
//			System.out.println("Arrays are equal.");
//		}
//		else
//		{
//			System.out.println("Arrays are not equal");
//		}
//		System.out.println(arr1+" "+arr2);

	}

}
