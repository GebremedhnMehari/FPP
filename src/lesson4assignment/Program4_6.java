/**
 * @author Gebremedhn Mehari, ID: 985113
 */
package lesson4assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Program4_6 {

	String stutter = "";
	int n = 0;
	String[] substr = new String[n];
	String characters = "";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type a String: ");
		String s = in.nextLine();

		Program4_6 p = new Program4_6();

		int result3 = p.length(s);
		System.out.println("String Length :" + result3); // length
		System.out.print("Substrings of the String "+s+" are  :");
		p.substr(s);

		System.out.println("The sum of numbers in the String :"
				+ p.sumNumber(s));

		System.out.println("The Stutter String is :" + p.stutter(s));

		if (p.palindrome(s) == true)
			System.out.println(s + " is a Palindrome string");
		else
			System.out.println(s + " is Not a Palindrome string");
		System.out.println(" Characters of string are : " + p.charstr(s));
	}

	// find length of string
	public int length(String s) {
		if (s.equals(""))
			return 0;
		else
			return length(s.substring(1)) + 1;
	}

	// Display Substrings of the string
	public void substr(String s) {

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j <= s.length() - i; j++) {
				String sub = s.substring(i, i + j);
				if (!sub.isEmpty())
					System.out.print(sub + "  "); // print the substrings
			}
		}

		System.out.println();
	}
   
	// Display the characters of the string
	public String charstr(String s) {
		if (s.length() == 0)
			return characters;
		else {

			int f = 1;
			for (int i = 0; i < characters.length(); i++)
				if (characters.charAt(i) == s.charAt(0))
					f = 0;
			if (f != 0)
				characters += s.charAt(0);

			charstr(s.substring(1, s.length()));
		}

		return characters;
	}

	// Find sum of number in a string
	public int sumNumber(String s) {
		if (s.length() == 0)
			return 0;
		else {
			if (Character.isDigit(s.charAt(0))) {
				return Character.getNumericValue(s.charAt(0))
						+ sumNumber(s.substring(1));
			} else
				return sumNumber(s.substring(1));
		}
	}

	// stutter method returns the stutter equivalent of the string
	public String stutter(String s) {

		if (s.length() == 0) {
			return null;
		}

		else {

			stutter += s.charAt(0) + "" + s.charAt(0);
			stutter(s.substring(1));
		}
		return stutter;
	}

	// Check the string is palindrome or not
	public boolean palindrome(String s) {

		// if length is 0 or 1 then String is palindrome
		if (s.length() == 0 || s.length() == 1)
			return true;
		// check for first and last char of String
		if (s.charAt(0) == s.charAt(s.length() - 1)) {
			return palindrome(s.substring(1, s.length() - 1));
		}
		// If program control reaches to this statement it means the String is
		// not palindrome hence return false
		return false;
	}

}

