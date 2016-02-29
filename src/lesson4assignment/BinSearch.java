
/**
 * @author Gebremedhn Mehari, ID: 985113
 */
package lesson4assignment;

public class BinSearch {
	   private boolean Search(String s, char c) {
		  int low=0;
		  int high=s.length()-1;
	      if (low > high)
	    	  return false; 
	      int mid = (low + high)/2;
	      if (s.charAt(mid)== c)
	    	  return true;
	      else if (s.charAt(mid) < c)
	         return Search(s.substring(mid+1), c);
	      else // last possibility
	         return Search(s.substring(0, mid), c);
	   }
	   public static void main(String args[]) {
		    BinSearch value = new BinSearch();
			boolean result = value.Search("abdefgkl", 'e');
			System.out.println(" Is the character found in the given ascending order String = " + result);
			
		}
	}

