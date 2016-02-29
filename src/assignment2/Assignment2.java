

/**
 * @author Gebremedhn Mehari, ID: 985113
 * This Assignment2 class consists of all methods for Question 2.1 to Question 2.12 
 * Lab Assignment 2
 */
package assignment2;
import java.util.Scanner; 

public class Assignment2 {

	public static void main(String[] args) {
		
		// 2.1 capitalize main method test
		Assignment2 obj1 = new Assignment2();
		String str = "go@y";
		System.out.println(obj1.capitalize(str));
		

		// 2.2 scrable main method test
		
	   /*Assignment2 obj2=new Assignment2();
		 int points=obj2.scrable("FARM");
		 System.out.println("The Equivalents points to the word is="+points);*/
		
		 
		
		// 2.3 isPalindrome main method test
		
		/*Assignment2 obj3 = new Assignment2();
		String str1 = "noon";
		System.out.println(obj3.isPalindrome(str1));
		String str2 = "afternoon";
		System.out.println(obj3.isPalindrome(str2));*/
		 
		// 2.4 isEnglishconsonant main method test
		
		/*Assignment2 obj4 = new Assignment2(); 
		boolean c = obj4.isEnglishconsonant('G');
		System.out.println("isEnglishconsonant is " + c);*/
		 
		// 2.5 inchtocm main method test
		
		/*Assignment2 obj5 = new Assignment2();
		Scanner inch = new Scanner(System.in);
		System.out.println("Enter The measurement in Inches:");
		double Inches = inch.nextDouble();
		System.out.print("The measurement in centimeter is:");
		System.out.println(obj5.inchtocm(Inches));*/
		 
		// 2.6  average main method test
		
	/*  Assignment2 obj6=new Assignment2(); 
	  Scanner input= new Scanner(System.in); 
	  System.out.println("Enter The First number:"); 
	  double Firstnumber = input.nextDouble();
	  System.out.println("Enter The Second number:");
	  double Secondnumber =input.nextDouble(); 
	  double result=obj6.average(Firstnumber,Secondnumber);
	  System.out.println("Average of the two numbers is="+result);*/
	 
		// 2.7divisible main method test ???
		  /* Assignment2 obj7=new Assignment2();
		   obj7.divisible();*/
        		
		 // 2,8  reverseArray main method test

	/*	Assignment2 obj8 = new Assignment2();
		int[] Array = { 10, 20, 30, 40, 50 };
		System.out.println("reverseArray is: ");
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
		}
		int[] res = obj8.reverseArray(Array);
		System.out.println("\nreverseArray is: ");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}*/
        // 2.9
		
		  //display substrings
		/*  System.out.println(); String s = "a friendly face";
		  System.out.println("s.charAt(2) ="+s.charAt(2));
		  System.out.println("s.length()  ="+s.length());
		  System.out.println("s.substring(2,9)  ="+s.substring(2,9));
		  System.out.println("s.substring(4)  ="+s.substring(4));*/
		
		// 2.10   ???main method test

	/*	p.substrings("TARE");  //Generate Substrings

		System.out.println();

		String[] animals = { "horse", "dog", "cat", "horse", "dog" };
		 p.removeDuplicates(animals); // List with out duplicate
*/		
		
		// 2.11 removeDuplicates main method test
		
	/*	Assignment2 obj11 = new Assignment2();
		String[] Str = { "horse", "dog", "cat", "horse", "dog" };
		System.out.print("Original List: ");
		for (int i = 0; i < Str.length; i++) {
			System.out.print(Str[i] + " ");
		}
		String[] result = obj11.removeDuplicates(Str);
		System.out.print("\nList without duplicates is: ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}*/

		// 2.12  factors main method test
		
		/*  Assignment2 obj12=new Assignment2();
		  obj12.factors();*/
		 

	}
    //////////////////////////////////////////////////////////////////////////////
	// 2.1 capitalize
    
	private char toLower(char ch) {
		if (ch >= 'A' && ch <= 'Z') {
			return (char) ((ch - 'A') + 'a');

		}
		return ch;
	}

	private char toCapital(char ch) {
		if (ch >= 'a' && ch <= 'z') {
			return (char) ((ch - 'a') + 'A');

		}
		return ch;
	}

	private String capitalize(String str) {
		String S = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {

				S = S + toCapital(str.charAt(i));
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				S = S + toLower(str.charAt(i));
			else
				S = S + str.charAt(i);

		}

		return S;
	}
    ////////////////////////////////////////////////////////////////////////////////
	
	// 2.2 scrable

	private int scrable(String str) {
		int totalpoint = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				switch (str.charAt(i)) {
				case 'A':
				case 'E':
				case 'I':
				case 'L':
				case 'N':
				case 'O':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
					totalpoint = totalpoint + 1;
					break;
				case 'D':
				case 'G':
					totalpoint = totalpoint + 2;
					break;
				case 'B':
				case 'C':
				case 'M':
				case 'P':
					totalpoint = totalpoint + 3;
					break;
				case 'F':
				case 'H':
				case 'V':
				case 'W':
				case 'Y':
					totalpoint = totalpoint + 4;
					break;
				case 'K':
					totalpoint = totalpoint + 5;
					break;
				case 'J':
				case 'X':
					totalpoint = totalpoint + 8;
					break;
				case 'Q':
				case 'Z':
					totalpoint = totalpoint + 10;
				default:
					totalpoint = totalpoint + 0;
				}
			}
		}

		return totalpoint;
	}
    //////////////////////////////////////////////////////////////////////
	
	// 2.3 isPalindrome
	
	private boolean isPalindrome(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
				return false;
			}
		}
		return (true);
	}
	
	////////////////////////////////////////////////////////////////////////
	
	// 2.4 isEnglishconsonant

	private boolean isEnglishconsonant(char ch) {

		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {
				return false;
			} else {
				if (ch >= 'A' && ch <= 'Z')
					System.out.println(ch);
				return true;
			}
		} else
			return false;
	}
	
	/////////////////////////////////////////////////////////////////////////
	
	// 2.5 inchtocm
	
	private double inchtocm(double inch) {

		double cm;
		cm = inch * 2.54;
		return cm;
	}
	 
   /////////////////////////////////////////////////////////////////////////
	
	// 2.6average
	
	private double average(double firstnumber, double secondnumber) {

		double ave;
		ave=(firstnumber+secondnumber)/2;
		return ave;
	}
  ////////////////////////////////////////////////////////////////////////////
	
	// 2.7 Divisible by 6 or 7
	
	private void divisible(){
	for(int i = 1;i<100;i++)
		if(i%6==0||i%7==0)
		System.out.print(i+" ");
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	// 2.8 reverse array

	private int[] reverseArray(int[] array) {
		for (int i = 0; i <= array.length / 2; i++) {

			int temp = array[i];
			array[i] = array[array.length - (i + 1)];
			array[array.length - (i + 1)] = temp;

		}
		return array;

	}
	 
   //////////////////////////////////////////////////////////////////////////////
	
	// 2.9
	
	
//////////////////////////////////////////////////////////////////////////////////

	
	// 2.10 substrings
	//////////////////////////////////////////////////////////////////////////////////////
	private void substrings(String str) {
		int f=1;
		int w=0;
		String prefix = "";
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
             
			for (int i = 0; i <= n; i++) {
				System.out.println("Substrings of length "+i);
				for (int j = 0; j < n; j++) {
					for (int k = 0; k <= n; k++) {
						if (k >= j) {
							if (str.substring(j, k).length() == i)
							{ 
								System.out.println(str.substring(j, k));
								
				  }
				}
			  }
			}
		  }
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////////
	// 2.11 removeDuplicates
	
	private void removeDuplicates(String args[]) {
		int n = args.length;
		String[] newlist = new String[n];
		int f = 1, k = 0;
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < newlist.length; j++) {
				if (args[i] == newlist[j]) {
					f = 0;
				}
			}
			if (f != 0) {
				newlist[k] = args[i];
				k++;
			}
		}
		System.out.print("The Orginal List :");
		for (int i = 0; i < args.length; i++)
			System.out.print(args[i] + "  ");
		System.out.println();
		System.out.println();
		System.out.print("List without duplicate :");
		for (int i = 0; i < k; i++)
			System.out.print(newlist[i] + "  ");
		System.out.println();
		
	}
	 
///////////////////////////////////////////////////////////////////////////////////
	// 2.12 factors

	private void factors() {
		for (int i = 2; i < 100; i++) {
			System.out.println("Factors of " + i + ":");
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print(" " + j);
				}
			}
			System.out.println();
		}

	}
	 
}
/////////////////////////////////////////////////////////////////////////////////////


