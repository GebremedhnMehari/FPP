package programmingAss4;
public class BinSearchV2 {
	private boolean search(String s, char c) {
		  int low=0;
		  int high=s.length()-1;
	      if (low > high)
	    	  return false; 
	      int mid = (low + high)/2;
	      if (s.charAt(mid)== c)
	    	  return true;
	      else if (s.charAt(mid) < c)
	         return search(s.substring(mid+1), c);
	      else // last possibility
	         return search(s.substring(0, mid), c);
	   }

	// main method
	public static void main(String args[]) {
		BinSearchV2 input = new BinSearchV2();
		boolean result = input.search("abdelgkuvw", 'u');
		System.out.println(" Is the character found in the given ascending order String = " + result);
		
	}
}