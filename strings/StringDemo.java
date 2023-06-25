/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = { 'C', 'o', 'd', 'i', 'n', 'g' };
		String str = "Coding";// Non primitive datatype
		System.out.println(str.substring(3));// a part of a string

		String substr = str.substring(1, 4);
//		String substr=str.substring(1, 7);//out of bound
		System.out.println(substr);

//		String str1="";
//		System.out.println(str.length());
//		System.out.println(str.charAt(2));
////		System.out.println(str.charAt(-1)); //It is not valid
////		System.out.println(str.charAt(6)); //It is also not valid
//		System.out.println(str1.length());
//		
//		String str2=" is fun";
//		String str3="Coding";
//		String str4="Aoding";
//		String str5="Eoding";
////		str+=str2;
////		str=str.concat(str2);
//		System.out.println(str);
//		System.out.println(str.equals(str2));
//		System.out.println(str.equals(str3));
//		System.out.println(str3.compareTo(str4));//Difference between two ascii values(first String is larger than second string)
//		System.out.println(str3.compareTo(str5));//Difference between two ascii values(Second String is larger than first string)
//		System.out.println(str.contains("ing"));//Is there any existance of second string, in the first string
		
		Scanner sc=new Scanner(System.in);		
		String str6=sc.nextLine();//space is delimiter, for that we use nextLine()
		String s2=sc.next();
		System.out.println(str6+" "+str6.length());
		System.out.println(s2+" "+s2.length());
	}

}
