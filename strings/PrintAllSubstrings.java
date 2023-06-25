/**
 * 
 */
package strings;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrintAllSubstrings {
	public static void printSubstrings(String str) {
//		for (int start = 0; start < str.length(); start++) {
//			// we will printing all substrings starting with char at index start
//			for(int end=start;end<str.length();end++)
//			{
//				System.out.println(str.substring(start, end+1));
//			}
//
//		}
		for(int len=1;len<=str.length();len++)
		{
			//we have to print all strings with length as "len".
			for(int start=0;start<=str.length()-len;start++)
			{
				int end=start+len-1;
				System.out.println(str.substring(start, end+1));
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pqrs";
		printSubstrings(str);

	}

}
