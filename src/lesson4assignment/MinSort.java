

/**
 * @author Gebremedhn Mehari, ID: 985113
 */
package lesson4assignment;
import java.util.Scanner;

public class MinSort {
	String copy=" ";
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type a String: ");
		String x = in.nextLine();
		String s=x;
		
		int[] i={3,5,6,4,9,1};
		MinSort ms= new MinSort();

		
		int result2=ms.minchar(s);
		System.out.println(result2);
		
		String result3=ms.sort(s);
		System.out.println(result3);
	}
  public String sort(String s) {
		
	   String t;
	    
		if(s.length()==0)
		{
			return null;//Base Case:do nothing
		}
		else
		{
			
			int n=s.length();
			if(s.length()>0)	
			{
				int minpos=minchar(s);
				//System.out.print(s.charAt(minpos));
				
		        
				char[] carr = s.toCharArray();
				char tmp = carr[0];
				carr[0] = carr[minpos];
				carr[minpos] = tmp;
				
				
				s=new String( carr);
				copy=copy+s.charAt(0);
				t=s.substring(1);
				
		        sort(t);
		       		        	
			}
			
		}
		
		return copy;
	}


public int minchar(String a) {
    int maxi;
    int n=a.length();
    if (n == 1)
    	return 0;
    maxi = minchar(a.substring(0,n-1));
    if (a.charAt(n-1) < a.charAt(maxi)) return n-1;
    return maxi;
}
}
