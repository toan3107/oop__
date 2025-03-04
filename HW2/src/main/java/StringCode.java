import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		int dodaichuoicondainhat=0;

		for(int i=0;i<str.length();i++)
		{
			int dodaichuoiconhientai=1;
			char currentChar=str.charAt(i);
			while(currentChar==str.charAt(i+1)&&i+1<str.length())
			{
				dodaichuoiconhientai++;
				i++;
			}
			dodaichuoicondainhat=Math.max(dodaichuoicondainhat,dodaichuoiconhientai);

		}

		return dodaichuoicondainhat; // YOUR CODE HERE
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		StringBuilder result=new StringBuilder();
		for (int i=0;i<str.length();i++)
		{

			char currentChar=str.charAt(i);
			if(Character.isDigit(str.charAt(i))&&Character.isAlphabetic(str.charAt(i+1)))
			{
				int digitvalue= Character.getNumericValue(currentChar);
						char nextChar =str.charAt(i+1);
						for (int j=0;j<digitvalue;i++)
						{
							result.append(nextChar);

						}


			}
			else {
				result.append(currentChar);
			}
		}
		return result.toString(); // YOUR CODE HERE
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		return false; // YOUR CODE HERE
	}
}
